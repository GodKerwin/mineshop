package com.xul.mineshop.basic.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

/**
 * Created by lxu on 2017/12/22.
 */
@Configuration
@ConfigurationProperties(prefix = "mail")
class MailProperties {

    String url
    String username
    String password
    String subject

}
