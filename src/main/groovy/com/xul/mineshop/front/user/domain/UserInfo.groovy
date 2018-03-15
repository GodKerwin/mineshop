package com.xul.mineshop.front.user.domain

import com.xul.mineshop.front.user.enums.ActiveStatus

/**
 * Created by lxu on 2018/3/14.
 */
class UserInfo implements Serializable{

    /**
     * 用户id
     */
    String user_id

    /**
     * 用户名
     */
    String username

    /**
     * 密码，加密存储
     */
    String password

    /**
     * 手机号
     */
    String phone

    /**
     * 邮箱
     */
    String email

    /**
     * 创建时间
     */
    Integer crt_time

    /**
     * 最后一次修改时间
     */
    Integer mod_time

    /**
     * 验证码
     */
    String code

    /**
     * 激活状态（0=>待激活，1=>启用）
     */
    ActiveStatus act_status


    @Override
    String toString() {
        return "UserInfo{" +
                "user_id='" + user_id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", crt_time=" + crt_time +
                ", mod_time=" + mod_time +
                ", code='" + code + '\'' +
                ", act_status=" + act_status +
                '}';
    }
}
