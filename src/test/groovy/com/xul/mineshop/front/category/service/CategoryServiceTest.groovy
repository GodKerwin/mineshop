package com.xul.mineshop.front.category.service

import com.xul.mineshop.front.category.domain.CategoryImageInfo
import com.xul.mineshop.front.category.domain.CategoryInfo
import com.xul.mineshop.front.category.domain.CategorySecondaryInfo
import com.xul.mineshop.front.category.enums.CategoryImgType
import com.xul.mineshop.front.category.enums.CategoryType
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Rollback
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Transactional

/**
 * Created by lxu on 2018/2/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(true)
@Transactional
class CategoryServiceTest {

    @Autowired
    CategoryService categoryService

    Integer category_id = 1

    @Test
    void queryIndexAdByOrder() {
        List<CategoryInfo> list = categoryService.queryCategoryByType(CategoryType.VERTICAL, 0, 10)
        list?.each {
            println it
        }
    }

    @Test
    void queryImagesByCategory(){
        List<CategoryImageInfo> list = categoryService.queryImagesByCategory(category_id, CategoryImgType.BRAND)
        list?.each {
            println it
        }
    }

    @Test
    void queryInfosByCategory(){
        List<CategorySecondaryInfo> list = categoryService.queryInfosByCategory(category_id)
        list?.each {
            println it
        }
    }

}
