package com.xul.mineshop.basic.domain

/**
 * Created by lxu on 2017/12/21.
 */
class BasicOutputBean<T> implements Serializable{

    /**
     * 状态码
     */
    Integer code

    /**
     * 提示信息
     */
    String message

    /**
     * 返回数据
     */
    T data

    @Override
    String toString() {
        return "BasicOutputBean{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}'
    }
}
