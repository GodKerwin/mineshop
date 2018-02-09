package com.xul.mineshop.basic.aspect

import groovy.util.logging.Slf4j
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.AfterReturning
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component
import org.springframework.web.context.request.RequestContextHolder
import org.springframework.web.context.request.ServletRequestAttributes

import javax.servlet.http.HttpServletRequest

/**
 * Created by lxu on 2017/12/26.
 */
@Slf4j
@Aspect
@Component
class HttpAspect {

    @Pointcut("execution(public * com.kerwin.mine.*.*.controller.*.*(..))")
    void log() {}

    @Before("log()")
    void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes()
        HttpServletRequest request = attributes.getRequest()
        //url
        log.info("url={}", request.getRequestURL())
        //method
        log.info("method={}", request.getMethod())
        //ip
        log.info("ip={}", request.getRemoteAddr())
        //类方法
        log.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName())
        //参数
        log.info("args={}", joinPoint.getArgs())
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    void doAfterReturning(Object object){
        log.info("response={}", object)
    }
}
