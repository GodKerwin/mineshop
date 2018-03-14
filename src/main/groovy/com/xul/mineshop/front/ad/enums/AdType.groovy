package com.xul.mineshop.front.ad.enums

import com.fasterxml.jackson.annotation.JsonValue

/**
 * 广告分类
 * Created by lxu on 2018/2/8.
 */
enum AdType {

    //轮播图
    BANNER(0),
    //其他
    OTHER(1)

    int value

    AdType(int value) {
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
        return "AdType{" +
                "value=" + value +
                '}'
    }
}