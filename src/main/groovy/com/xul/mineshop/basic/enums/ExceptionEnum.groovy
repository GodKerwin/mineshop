package com.xul.mineshop.basic.enums

/**
 * Created by lxu on 2017/12/21.
 */
enum ExceptionEnum {

    //公共异常
    UNKNOW_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    DATA_ERROR(1, "数据操作异常"),
    SYSTEM_BUSY(2, "服务繁忙"),
    INPUT_EMPTY(3, "入参为空"),

    //系统功能异常
    MAIL_EXCEPTION(100, "激活邮件发送失败"),

    //用户业务异常
    USER_EXIST(200, "用户名已被占用"),
    LOGIN_ERROR(201, "用户名或密码错误"),
    MAILLOGIN_ERROR(202, "邮箱或密码错误"),
    CHECKCODE_ERROR(203, "验证码错误"),
    ;

    /**
     * 状态码
     */
    Integer code

    /**
     * 提示信息
     */
    String msg

    ExceptionEnum(Integer code, String msg) {
        this.code = code
        this.msg = msg
    }
}
