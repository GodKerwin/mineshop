package com.xul.mineshop.basic.handle

import com.xul.mineshop.basic.domain.BasicOutputBean
import com.xul.mineshop.basic.enums.ExceptionEnum
import com.xul.mineshop.basic.exception.MineSystemException
import com.xul.mineshop.basic.utils.BasicOutputBeanUtil
import groovy.util.logging.Slf4j
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Created by lxu on 2017/12/26.
 */
@Slf4j
@ControllerAdvice
class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    BasicOutputBean handle(Exception e) {
        if (e instanceof MineSystemException) {
            return BasicOutputBeanUtil.error((e as MineSystemException).code, e.message)
        } else {
            log.error("【系统异常】{}", e.toString())
            return BasicOutputBeanUtil.error(ExceptionEnum.UNKNOW_ERROR.code, ExceptionEnum.UNKNOW_ERROR.msg)
        }
    }

}
