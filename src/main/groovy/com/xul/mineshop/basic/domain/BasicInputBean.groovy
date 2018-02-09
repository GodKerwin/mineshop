package com.xul.mineshop.basic.domain

/**
 * Created by lxu on 2017/12/21.
 */
class BasicInputBean implements Serializable{

    /**
     * 用户名
     */
    String user_id

    /**
     * 用户角色ID
     */
    String user_role

    @Override
    String toString() {
        return "BasicInputBean{" +
                "user_id='" + user_id + '\'' +
                ", user_role='" + user_role + '\'' +
                '}'
    }
}
