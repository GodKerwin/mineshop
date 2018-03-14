package com.xul.mineshop.front.category.domain

import com.xul.mineshop.front.category.enums.CategoryType


/**
 * Created by lxu on 2018/2/8.
 */
class CategoryInfo implements Serializable {

    /**
     * 分类id
     */
    Integer category_id

    /**
     * 分类类型（0=>纵向分类，1=>横向分类（快捷入口））
     */
    CategoryType category_type

    /**
     * 名称
     */
    String name

    /**
     * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    Integer order

    /**
     * 创建时间
     */
    Integer crt_time

    /**
     * 最后一次修改时间
     */
    Integer mod_time

    /**
     * 二三级类目列表
     */
    List<CategorySecondaryInfo> secondary_list

    /**
     * 图片列表
     */
    List<CategoryImageInfo> image_list

    @Override
    String toString() {
        return "CategoryInfo{" +
                "category_id=" + category_id +
                ", category_type=" + category_type +
                ", name='" + name + '\'' +
                ", order=" + order +
                ", crt_time=" + crt_time +
                ", mod_time=" + mod_time +
                ", secondary_list=" + secondary_list +
                ", image_list=" + image_list +
                '}'
    }
}
