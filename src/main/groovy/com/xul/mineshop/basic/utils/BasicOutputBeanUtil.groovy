package com.xul.mineshop.basic.utils

import com.xul.mineshop.basic.domain.BasicOutputBean
import com.xul.mineshop.basic.enums.ExceptionEnum

/**
 * Created by lxu on 2017/12/21.
 */
class BasicOutputBeanUtil {

    static BasicOutputBean success(Object obj) {
        ExceptionEnum success = ExceptionEnum.SUCCESS
        BasicOutputBean output = new BasicOutputBean([
                code   : success.code,
                message: success.msg,
                data   : obj
        ])
        return output
    }

    static BasicOutputBean success() {
        success(null)
    }

    static BasicOutputBean error(Integer code, String msg) {
        BasicOutputBean output = new BasicOutputBean([
                code   : code,
                message: msg
        ])
        return output
    }

}
