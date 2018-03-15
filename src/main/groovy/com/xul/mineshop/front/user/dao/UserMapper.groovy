package com.xul.mineshop.front.user.dao

import com.xul.mineshop.front.user.domain.UserInfo
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

/**
 * Created by lxu on 2018/3/14.
 */
@Mapper
interface UserMapper {

    /**
     * 注册用户
     */
    Integer userRegister(@Param("user")UserInfo user)

    /**
     * 判断用户名是否存在
     */
    Integer checkUsernameExist(@Param("username")String username)

    /**
     * 判断邮箱是否存在
     */
    Integer checkEmailExist(@Param("email")String email)

    /**
     * 根据用户名查询用户信息
     */
    UserInfo getUserByUsername(@Param("username")String username)

    /**
     * 根据邮箱查询用户信息
     */
    UserInfo getUserByEmail(@Param("email")String email)
}