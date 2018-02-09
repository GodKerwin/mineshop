package com.xul.mineshop.front.category.service

import com.xul.mineshop.basic.enums.ExceptionEnum
import com.xul.mineshop.basic.exception.MineSystemException
import com.xul.mineshop.front.category.dao.CategoryImageMapper
import com.xul.mineshop.front.category.dao.CategoryMapper
import com.xul.mineshop.front.category.dao.CategorySecondaryMapper
import com.xul.mineshop.front.category.domain.CategoryImageInfo
import com.xul.mineshop.front.category.domain.CategoryInfo
import com.xul.mineshop.front.category.domain.CategorySecondaryInfo
import com.xul.mineshop.front.category.enums.CategoryImgType
import com.xul.mineshop.front.category.enums.CategoryType
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by lxu on 2018/2/8.
 */
@Slf4j
@Service
class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper
    @Autowired
    private CategoryImageMapper categoryImageMapper
    @Autowired
    private CategorySecondaryMapper categorySecondaryMapper

    /**
     * 根据顺序获取首页轮播广告
     */
    List<CategoryInfo> queryCategoryByType(CategoryType category_type, Integer offset, Integer size) {
        try {
            categoryMapper.queryCategoryByType(category_type, offset, size)
        } catch (Exception e) {
            log.error(e.toString())
            throw new MineSystemException(ExceptionEnum.DATA_ERROR)
        }
    }

    /**
     * 根据分类ID获取分类图
     */
    List<CategoryImageInfo> queryImagesByCategory(Integer category_id, CategoryImgType category_img_type) {
        try {
            categoryImageMapper.queryImagesByCategory(category_id, category_img_type)
        } catch (Exception e) {
            log.error(e.toString())
            throw new MineSystemException(ExceptionEnum.DATA_ERROR)
        }
    }

    /**
     * 根据分类ID获取二级类目及其子类目
     */
    List<CategorySecondaryInfo> queryInfosByCategory(Integer category_id) {
        try {
            List<CategorySecondaryInfo> secondary_list = categorySecondaryMapper.querySecondaryInfos(category_id)
            secondary_list?.each {
                it.setThird_categorys(categorySecondaryMapper.queryThirdInfos(category_id, it.id))
            }
            return secondary_list
        } catch (Exception e) {
            log.error(e.toString())
            throw new MineSystemException(ExceptionEnum.DATA_ERROR)
        }
    }

}
