package com.xul.mineshop.front.category.enums

/**
 * 分类类型
 * Created by lxu on 2018/2/8.
 */
enum CategoryType {

    //纵向分类
    VERTICAL(0, "VERTICAL"),
    //横向分类（快捷入口）
    HORIZONTAL(1, "HORIZONTAL")

    int value
    String name

    CategoryType(int value, String name) {
        this.value = value
        this.name = name
    }

    @Override
    String toString() {
        return this.name + "[" + this.value + "]"
    }
}