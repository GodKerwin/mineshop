package com.xul.mineshop.front.ad.enums

/**
 * 广告分类
 * Created by lxu on 2018/2/8.
 */
enum AdType {

    //轮播图
    BANNER(0, "BANNER"),
    //其他
    OTHER(1, "OTHER")

    int value
    String name

    AdType(int value, String name) {
        this.value = value
        this.name = name
    }

    @Override
    String toString() {
        return this.name + "[" + this.value + "]"
    }
}