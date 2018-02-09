package com.xul.mineshop.basic.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

/**
 * Created by lxu on 2017/12/22.
 */
@Configuration
@ConfigurationProperties(prefix = "mail")
class MailProperties {

    String url = "172.16.23.33:8080"
    String username = "MineWorldServer@163.com"
    String password = "cptbtptp123"
    String content = "Click here to activate your account"
    String subject = "来自徐大大-我的世界网站的激活邮件"

}
