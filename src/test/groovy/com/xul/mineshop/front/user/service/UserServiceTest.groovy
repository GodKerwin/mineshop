package com.xul.mineshop.front.user.service

import com.xul.mineshop.front.user.domain.UserInfo
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Rollback
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Transactional

/**
 * Created by lxu on 2018/3/15.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(true)
@Transactional
class UserServiceTest {

    @Autowired
    UserService userService

    private String username = 'admin'
    private String password = '111111'
    private String phone = '13761843260'
    private String email = '513624876@qq.com'
    private UserInfo userInfo = new UserInfo([
            username  : username,
            password  : password,
            phone     : phone,
            email     : email,
    ])

    @Test
    void userRegister() {
        println userService.userRegister(userInfo)
    }

    @Test
    void checkUsernameExist() {
        println userService.checkUsernameExist(username)
    }

    @Test
    void checkEmailExist() {
        println userService.checkEmailExist(email)
    }

    @Test
    void sendEmail() {
        println userService.sendEmail(email)
    }

    @Test
    void userLogin() {
        userInfo.setUsername(null)
        println userService.userLogin(userInfo)
    }

}
