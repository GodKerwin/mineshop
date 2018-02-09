package com.xul.mineshop.front.category.domain

import com.xul.mineshop.basic.enums.DelStatus
import com.xul.mineshop.front.category.enums.CategoryImgType

/**
 * Created by lxu on 2018/2/8.
 */
class CategoryImageInfo {

    /**
     * 图片id
     */
    Integer id

    /**
     * 分类id
     */
    Integer category_id

    /**
     * 网址
     */
    String href

    /**
     * 提示
     */
    String alt

    /**
     * 分类图类型（0=>商标，1=>分类图）
     */
    CategoryImgType category_img_type

    /**
     * 删除状态（0=>已删除，1=>未删除）
     */
    DelStatus del_status

    /**
     * 图片路径
     */
    String image_url

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

    @Override
    String toString() {
        return "CategoryImageInfo{" +
                "id=" + id +
                ", category_id=" + category_id +
                ", href='" + href + '\'' +
                ", alt='" + alt + '\'' +
                ", category_img_type=" + category_img_type +
                ", delStatus=" + del_status +
                ", image_url='" + image_url + '\'' +
                ", order=" + order +
                ", crt_time=" + crt_time +
                ", mod_time=" + mod_time +
                '}'
    }
}
