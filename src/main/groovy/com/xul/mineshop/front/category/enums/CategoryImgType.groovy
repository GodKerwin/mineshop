package com.xul.mineshop.front.category.enums

/**
 * 分类图类型
 * Created by lxu on 2018/2/8.
 */
enum CategoryImgType {

    //商标
    BRAND(0, "BRAND"),
    //分类图
    CATEGORY(1, "CATEGORY")

    int value
    String name

    CategoryImgType(int value, String name) {
        this.value = value
        this.name = name
    }

    @Override
    String toString() {
        return this.name + "[" + this.value + "]"
    }
}