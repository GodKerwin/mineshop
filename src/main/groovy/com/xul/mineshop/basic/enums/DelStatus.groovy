package com.xul.mineshop.basic.enums

import com.fasterxml.jackson.annotation.JsonValue

/**
 * 删除状态
 * Created by lxu on 2018/2/8.
 */
enum DelStatus {

    //已删除
    DEL(0),
    //未删除
    NORMAL(1)

    int value

    DelStatus(int value) {
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
        return "DelStatus{" +
                "value=" + value +
                '}'
    }
}