package com.xul.mineshop.basic.enums

/**
 * 展示类型
 * Created by lxu on 2018/2/9.
 */
enum DisplayType {

    //正常
    DEL(0, "NORMAL"),
    //加红
    NORMAL(1, "RED"),
    //搜索框显示
    SEARCH(2, "SEARCH")

    int value
    String name

    DisplayType(int value, String name) {
        this.value = value
        this.name = name
    }

    @Override
    String toString() {
        return this.name + "[" + this.value + "]"
    }
}