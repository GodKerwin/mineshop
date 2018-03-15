package com.xul.mineshop.front.user.enums

import com.fasterxml.jackson.annotation.JsonValue

/**
 * 激活状态
 * Created by lxu on 2018/2/8.
 */
enum ActiveStatus {

    //待激活
    INACTIVE(0),
    //启用
    ACTIVE(1)

    int value

    ActiveStatus(int value) {
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
        return "ActiveStatus{" +
                "value=" + value +
                '}'
    }
}