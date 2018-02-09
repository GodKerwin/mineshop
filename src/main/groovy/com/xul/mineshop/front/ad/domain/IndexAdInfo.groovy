package com.xul.mineshop.front.ad.domain

import com.xul.mineshop.front.ad.enums.AdType
import com.xul.mineshop.basic.enums.DelStatus

/**
 * Created by lxu on 2018/2/8.
 */
class IndexAdInfo implements Serializable {

    /**
     * 主键id
     */
    Integer id

    /**
     * 广告分类（0=>轮播图，1=>其他）
     */
    AdType ad_type

    /**
     * 提示
     */
    String alt

    /**
     * 网址
     */
    String href

    /**
     * 图片路径
     */
    String image_url

    /**
     * 删除状态（0=>已删除，1=>未删除）
     */
    DelStatus del_status

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
        return "IndexAdInfo{" +
                "id=" + id +
                ", ad_type=" + ad_type +
                ", alt='" + alt + '\'' +
                ", href='" + href + '\'' +
                ", image_url='" + image_url + '\'' +
                ", del_status=" + del_status +
                ", order=" + order +
                ", crt_time=" + crt_time +
                ", mod_time=" + mod_time +
                '}'
    }
}
