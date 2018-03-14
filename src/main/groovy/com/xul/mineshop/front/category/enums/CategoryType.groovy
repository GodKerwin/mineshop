package com.xul.mineshop.front.category.enums

import com.fasterxml.jackson.annotation.JsonValue

/**
 * 分类类型
 * Created by lxu on 2018/2/8.
 */
enum CategoryType {

    //纵向分类
    VERTICAL(0),
    //横向分类（快捷入口）
    HORIZONTAL(1)

    int value

    CategoryType(int value) {
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
        return "CategoryType{" +
                "value=" + value +
                '}'
    }
}