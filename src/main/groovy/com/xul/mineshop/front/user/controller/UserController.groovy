package com.xul.mineshop.front.user.controller

import com.xul.mineshop.basic.domain.BasicOutputBean
import com.xul.mineshop.basic.enums.ExceptionEnum
import com.xul.mineshop.basic.exception.MineSystemException
import com.xul.mineshop.basic.utils.BasicOutputBeanUtil
import com.xul.mineshop.front.user.domain.UserInfo
import com.xul.mineshop.front.user.domain.UserInputBean
import com.xul.mineshop.front.user.service.UserService
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by lxu on 2018/3/14.
 */
@Slf4j
@RestController
class UserController {

    @Autowired
    private UserService userService

    @PostMapping("/front/user/userRegister")
    BasicOutputBean userRegister(UserInputBean input) {
        log.info "-----------------userRegister Begin-----------------"
        String user_id = null
        if (input.userInfo) {
            user_id = userService.userRegister(input.userInfo)
        } else {
            throw new MineSystemException(ExceptionEnum.INPUT_EMPTY)
        }
        log.info "------------------userRegister End------------------"
        return BasicOutputBeanUtil.success(user_id)
    }

    @GetMapping("/front/user/checkUsernameExist")
    BasicOutputBean checkUsernameExist(UserInputBean input) {
        log.info "-----------------checkUsernameExist Begin-----------------"
        boolean flag = null
        if (input.username) {
            flag = userService.checkUsernameExist(input.username)
        } else {
            throw new MineSystemException(ExceptionEnum.INPUT_EMPTY)
        }
        log.info "------------------checkUsernameExist End------------------"
        return BasicOutputBeanUtil.success(flag)
    }

    @GetMapping("/front/user/checkEmailExist")
    BasicOutputBean checkEmailExist(UserInputBean input) {
        log.info "-----------------checkEmailExist Begin-----------------"
        boolean flag = null
        if (input.email) {
            flag = userService.checkUsernameExist(input.email)
        } else {
            throw new MineSystemException(ExceptionEnum.INPUT_EMPTY)
        }
        log.info "------------------checkEmailExist End------------------"
        return BasicOutputBeanUtil.success(flag)
    }

    @PostMapping("/front/user/sendEmail")
    BasicOutputBean sendEmail(UserInputBean input) {
        log.info "-----------------sendEmail Begin-----------------"
        String code = null
        if (input.email) {
            code = userService.sendEmail(input.email)
        } else {
            throw new MineSystemException(ExceptionEnum.INPUT_EMPTY)
        }
        log.info "------------------sendEmail End------------------"
        return BasicOutputBeanUtil.success(code)
    }

    @PostMapping("/front/user/userLogin")
    BasicOutputBean userLogin(UserInputBean input) {
        log.info "-----------------userLogin Begin-----------------"
        UserInfo userInfo = null
        if (input.userInfo) {
            userInfo = userService.userLogin(input.userInfo)
        } else {
            throw new MineSystemException(ExceptionEnum.INPUT_EMPTY)
        }
        log.info "------------------userLogin End------------------"
        return BasicOutputBeanUtil.success(userInfo)
    }

}
