package com.xul.mineshop.front.category.dao

import com.xul.mineshop.front.category.domain.CategoryInfo
import com.xul.mineshop.front.category.enums.CategoryType
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

/**
 * Created by lxu on 2018/2/8.
 */
@Mapper
interface CategoryMapper {

    /**
     * 根据类型获取主分类
     */
    List<CategoryInfo> queryCategoryByType(@Param("category_type")CategoryType category_type,
                                           @Param("offset")Integer offset,
                                           @Param("size")Integer size)

}