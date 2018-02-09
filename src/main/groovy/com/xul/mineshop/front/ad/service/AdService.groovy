package com.xul.mineshop.front.ad.service

import com.xul.mineshop.basic.enums.ExceptionEnum
import com.xul.mineshop.basic.exception.MineSystemException
import com.xul.mineshop.front.ad.dao.IndexAdMapper
import com.xul.mineshop.front.ad.domain.IndexAdInfo
import com.xul.mineshop.front.ad.enums.AdType
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by lxu on 2018/2/8.
 */
@Slf4j
@Service
class AdService {

    @Autowired
    private IndexAdMapper indexAdMapper

    /**
     * 根据类型获取首页轮播广告
     */
    List<IndexAdInfo> queryIndexAdByType(AdType ad_type, Integer offset, Integer size) {
        try {
            indexAdMapper.queryIndexAdByType(ad_type, offset, size)
        } catch (Exception e) {
            log.error(e.toString())
            throw new MineSystemException(ExceptionEnum.DATA_ERROR)
        }
    }
}
