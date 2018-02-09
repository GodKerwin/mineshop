package com.xul.mineshop.basic.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

/**
 * Created by lxu on 2018/1/9.
 */
@Configuration
@ConfigurationProperties(prefix = "user")
class UserProperties {

    String defaultRole = "UROLE10003"

}
