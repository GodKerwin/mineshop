package com.xul.mineshop.front.category.dao

import com.xul.mineshop.front.category.domain.CategorySecondaryInfo
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

/**
 * Created by lxu on 2018/2/8.
 */
@Mapper
interface CategorySecondaryMapper {

    /**
     * 根据主分类获取二级分类
     */
    List<CategorySecondaryInfo> querySecondaryInfos(@Param("category_id") Integer category_id)

    /**
     * 根据二级分类获取类目
     */
    List<CategorySecondaryInfo> queryThirdInfos(@Param("category_id") Integer category_id,
                                                @Param("id") Integer id)
}