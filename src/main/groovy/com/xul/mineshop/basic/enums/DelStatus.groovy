package com.xul.mineshop.basic.enums

/**
 * 删除状态
 * Created by lxu on 2018/2/8.
 */
enum DelStatus {

    //已删除
    DEL(0, "DEL"),
    //未删除
    NORMAL(1, "NORMAL")

    int value
    String name

    DelStatus(int value, String name) {
        this.value = value
        this.name = name
    }

    @Override
    String toString() {
        return this.name + "[" + this.value + "]"
    }
}