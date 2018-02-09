package com.xul.mineshop.front.category.dao

import com.xul.mineshop.front.category.domain.CategoryImageInfo
import com.xul.mineshop.front.category.enums.CategoryImgType
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

/**
 * Created by lxu on 2018/2/8.
 */
@Mapper
interface CategoryImageMapper {

    /**
     * 根据分类ID获取分类图
     */
    List<CategoryImageInfo> queryImagesByCategory(@Param("category_id")Integer category_id,
                                                @Param("category_img_type")CategoryImgType category_img_type)

}