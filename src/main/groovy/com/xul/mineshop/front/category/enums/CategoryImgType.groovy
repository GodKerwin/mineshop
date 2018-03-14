package com.xul.mineshop.front.category.enums

import com.fasterxml.jackson.annotation.JsonValue

/**
 * 分类图类型
 * Created by lxu on 2018/2/8.
 */
enum CategoryImgType {

    //商标
    BRAND(0),
    //分类图
    CATEGORY(1)

    int value

    CategoryImgType(int value) {
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
        return "CategoryImgType{" +
                "value=" + value +
                '}'
    }
}