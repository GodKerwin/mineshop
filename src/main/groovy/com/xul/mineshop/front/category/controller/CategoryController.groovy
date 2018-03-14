package com.xul.mineshop.front.category.controller

import com.xul.mineshop.basic.domain.BasicOutputBean
import com.xul.mineshop.basic.enums.ExceptionEnum
import com.xul.mineshop.basic.exception.MineSystemException
import com.xul.mineshop.basic.utils.BasicOutputBeanUtil
import com.xul.mineshop.front.ad.domain.IndexAdInfo
import com.xul.mineshop.front.ad.enums.AdType
import com.xul.mineshop.front.category.domain.CategoryInfo
import com.xul.mineshop.front.category.enums.CategoryImgType
import com.xul.mineshop.front.category.enums.CategoryType
import com.xul.mineshop.front.category.service.CategoryService
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by lxu on 2018/3/9.
 */
@Slf4j
@RestController
class CategoryController {

    @Autowired
    private CategoryService categoryService

    @PostMapping("/front/category/queryCategorys")
    BasicOutputBean queryCategorys(){
        log.info "-----------------getIndexAds Begin-----------------"
        List<CategoryInfo> first_list = null
        try{
            first_list = categoryService.queryCategoryByType(CategoryType.VERTICAL, 0, 10)
            first_list?.each {
                it.setImage_list(categoryService.queryImagesByCategory(it?.category_id, null))
                it.setSecondary_list(categoryService.queryInfosByCategory(it?.category_id))
            }
        }catch (Exception e){
            log.error(e.toString())
            throw new MineSystemException(ExceptionEnum.SYSTEM_BUSY)
        }
        log.info "------------------getIndexAds End------------------"
        return BasicOutputBeanUtil.success(first_list)
    }

}
