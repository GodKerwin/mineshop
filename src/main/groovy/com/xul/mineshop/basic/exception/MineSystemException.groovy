package com.xul.mineshop.basic.exception

import com.xul.mineshop.basic.enums.ExceptionEnum

/**
 * Created by lxu on 2017/12/21.
 */
class MineSystemException extends RuntimeException{

    Integer code

    MineSystemException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.msg)
        this.code = exceptionEnum.code
    }
}
