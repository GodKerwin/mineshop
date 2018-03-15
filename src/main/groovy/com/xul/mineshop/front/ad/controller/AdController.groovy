package com.xul.mineshop.front.ad.controller

import com.xul.mineshop.basic.domain.BasicOutputBean
import com.xul.mineshop.basic.enums.ExceptionEnum
import com.xul.mineshop.basic.exception.MineSystemException
import com.xul.mineshop.basic.utils.BasicOutputBeanUtil
import com.xul.mineshop.front.ad.domain.IndexAdInfo
import com.xul.mineshop.front.ad.enums.AdType
import com.xul.mineshop.front.ad.service.AdService
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by lxu on 2018/3/9.
 */
@Slf4j
@RestController
class AdController {

    @Autowired
    private AdService adService

    /**
     * 获取首页轮播图
     */
    @GetMapping("/front/ad/queryIndexAds")
    BasicOutputBean queryIndexAds(){
        log.info "-----------------getIndexAds Begin-----------------"
        List<IndexAdInfo> list = adService.queryIndexAdByType(AdType.BANNER, 0, 8)
        log.info "------------------getIndexAds End------------------"
        return BasicOutputBeanUtil.success(list)
    }

}
