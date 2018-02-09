package com.xul.mineshop.front.ad.service

import com.xul.mineshop.front.ad.domain.IndexAdInfo
import com.xul.mineshop.front.ad.enums.AdType
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Rollback
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Transactional

/**
 * Created by lxu on 2018/2/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(true)
@Transactional
class AdServiceTest {

    @Autowired
    AdService adService

    @Test
    void queryIndexAdByOrder() {
        List<IndexAdInfo> list = adService.queryIndexAdByType(AdType.BANNER, 0, 5)
        list?.each {
            println it
        }
    }
}
