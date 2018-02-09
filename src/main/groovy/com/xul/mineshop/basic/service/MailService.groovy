package com.xul.mineshop.basic.service

import com.xul.mineshop.basic.enums.ExceptionEnum
import com.xul.mineshop.basic.exception.MineSystemException
import com.xul.mineshop.basic.properties.MailProperties
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

import javax.mail.*
import javax.mail.Message.RecipientType
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage

@Slf4j
@Component
class MailService {

    @Autowired
    private MailProperties mailProperties

    //获取Session
    private Session getSession() {
        Properties prop = new Properties()
        prop.setProperty("mail.transport.protocol", "smtp")
        prop.setProperty("mail.smtp.host", "smtp.163.com")
        prop.setProperty("mail.smtp.auth", "true")
        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(mailProperties.username, mailProperties.password)
            }
        })
        session.setDebug(true)
        return session
    }

    //发送激活邮件
    void sendMail(String email, String code) throws Exception {
        try {
            Message msg = new MimeMessage(getSession())
            msg.setFrom(new InternetAddress(mailProperties.username))
            msg.setRecipient(RecipientType.TO, new InternetAddress(email))
            msg.setSubject(mailProperties.subject)
            msg.setContent("<h1>" + mailProperties.content + "：</h1><h3><a href='http://" + mailProperties.url + "/#/active/" + code + "'>http://" + mailProperties.url + "/#/active/" + code + "</a></h3>", "text/html;charset=UTF-8")
            msg.setSentDate(new Date())
            Transport.send(msg)
        } catch (Exception e) {
            log.error(e.toString())
            throw new MineSystemException(ExceptionEnum.MAIL_EXCEPTION)
        }
    }
}
