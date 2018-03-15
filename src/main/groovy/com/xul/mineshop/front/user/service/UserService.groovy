package com.xul.mineshop.front.user.service

import com.xul.mineshop.basic.enums.ExceptionEnum
import com.xul.mineshop.basic.exception.MineSystemException
import com.xul.mineshop.basic.service.MailService
import com.xul.mineshop.basic.utils.MD5Util
import com.xul.mineshop.basic.utils.TimeUtil
import com.xul.mineshop.basic.utils.UUID
import com.xul.mineshop.front.user.dao.UserMapper
import com.xul.mineshop.front.user.domain.UserInfo
import com.xul.mineshop.front.user.enums.ActiveStatus
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by lxu on 2018/3/14.
 */
@Slf4j
@Service
class UserService {

    @Autowired
    private MailService mailService
    @Autowired
    private UserMapper userMapper

    String userRegister(UserInfo user) {
        try {
            UserInfo data = new UserInfo([
                    user_id   : UUID.generateUUID(),
                    username  : user.username,
                    password  : MD5Util.encode(user.password),
                    phone     : user.phone,
                    email     : user.email,
                    crt_time  : TimeUtil.timeStamp,
                    mod_time  : TimeUtil.timeStamp,
                    act_status: ActiveStatus.ACTIVE
            ])
            log.info("用户注册:[${data}]")
            userMapper.userRegister(data)
            return data.user_id
        } catch (Exception e) {
            e.printStackTrace()
            log.error(e.toString())
            throw new MineSystemException(ExceptionEnum.DATA_ERROR)
        }
    }

    boolean checkUsernameExist(String username) {
        try {
            userMapper.checkUsernameExist(username) != 0
        } catch (Exception e) {
            log.error(e.toString())
            throw new MineSystemException(ExceptionEnum.DATA_ERROR)
        }
    }

    boolean checkEmailExist(String email) {
        try {
            userMapper.checkEmailExist(email) != 0
        } catch (Exception e) {
            log.error(e.toString())
            throw new MineSystemException(ExceptionEnum.DATA_ERROR)
        }
    }

    String sendEmail(String email) {
        try {
            String code = UUID.generateCode()
            mailService.sendMail(email, code)
            return code
        } catch (Exception e) {
            log.error(e.toString())
            throw new MineSystemException(ExceptionEnum.MAIL_EXCEPTION)
        }
    }

    UserInfo userLogin(UserInfo user) {
        //账户登录
        UserInfo data = null
        if (user.username) {
            log.info("账户[${user.username}]尝试登录")
            if (!checkUsernameExist(user.username)) {
                throw new MineSystemException(ExceptionEnum.LOGIN_ERROR)
            }
            data = userMapper.getUserByUsername(user.username)
            if (!data.password.equals(MD5Util.encode(user.password))) {
                throw new MineSystemException(ExceptionEnum.LOGIN_ERROR)
            }
        //邮箱登录
        } else if (user.email) {
            log.info("邮箱[${user.email}]尝试登录")
            if (!checkEmailExist(user.email)) {
                throw new MineSystemException(ExceptionEnum.MAILLOGIN_ERROR)
            }
            data = userMapper.getUserByEmail(user.email)
            if (!data.password.equals(MD5Util.encode(user.password))) {
                throw new MineSystemException(ExceptionEnum.MAILLOGIN_ERROR)
            }
        }
        return data
    }

}
