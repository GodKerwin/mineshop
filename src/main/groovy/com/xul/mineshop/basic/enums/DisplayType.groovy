package com.xul.mineshop.basic.enums

import com.fasterxml.jackson.annotation.JsonValue

/**
 * 展示类型
 * Created by lxu on 2018/2/9.
 */
enum DisplayType {

    //正常
    NORMAL(0),
    //加红
    RED(1),
    //搜索框显示
    SEARCH(2)

    int value

    DisplayType(int value) {
        this.value = value
    }

    @JsonValue
    int getValue() {
        return value
    }

    void setValue(int value) {
        this.value = value
    }

    @Override
    String toString() {
        return "DisplayType{" +
                "value=" + value +
                '}'
    }
}