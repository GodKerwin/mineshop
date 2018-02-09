package com.xul.mineshop.front.category.domain

import com.xul.mineshop.basic.enums.DelStatus
import com.xul.mineshop.basic.enums.DisplayType

/**
 * Created by lxu on 2018/2/8.
 */
class CategorySecondaryInfo {

    /**
     * 类目id
     */
    Integer id

    /**
     * 分类id
     */
    Integer category_id

    /**
     * 父类目ID=0时，代表的是一级的类目
     */
    Integer parent_id

    /**
     * 名称
     */
    String name

    /**
     * 网址
     */
    String href

    /**
     * 删除状态（0=>已删除，1=>未删除）
     */
    DelStatus del_status

    /**
     * 展示类型（0=>正常，1=>加红, 2=>搜索框显示）
     */
    DisplayType display_type

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
     * 三级类目列表
     */
    List<CategorySecondaryInfo> third_categorys

    @Override
    String toString() {
        return "CategorySecondaryInfo{" +
                "id=" + id +
                ", category_id=" + category_id +
                ", parent_id=" + parent_id +
                ", name='" + name + '\'' +
                ", href='" + href + '\'' +
                ", del_status=" + del_status +
                ", display_type=" + display_type +
                ", order=" + order +
                ", crt_time=" + crt_time +
                ", mod_time=" + mod_time +
                ", third_categorys=" + third_categorys +
                '}'
    }
}
