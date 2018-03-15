package com.xul.mineshop.basic.service

import com.xul.mineshop.basic.utils.UUID
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Rollback
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Transactional

/**
 * Created by lxu on 2017/12/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(true)
@Transactional
class MailServiceTest {

    @Autowired
    private MailService mailService

    @Test
    void sendMail() throws Exception {
//        为避免每次构建都发送邮件，故注释，单测可解除注释
//        mailService.sendMail("513624876@qq.com", UUID.generateCode())
    }

}