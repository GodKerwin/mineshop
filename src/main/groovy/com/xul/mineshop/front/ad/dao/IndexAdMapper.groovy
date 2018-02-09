package com.xul.mineshop.front.ad.dao

import com.xul.mineshop.front.ad.domain.IndexAdInfo
import com.xul.mineshop.front.ad.enums.AdType
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param

/**
 * Created by lxu on 2018/2/8.
 */
@Mapper
interface IndexAdMapper {

    /**
     * 根据类型获取首页轮播广告
     */
    List<IndexAdInfo> queryIndexAdByType(@Param("ad_type")AdType ad_type,
                                         @Param("offset")Integer offset,
                                         @Param("size")Integer size)

}