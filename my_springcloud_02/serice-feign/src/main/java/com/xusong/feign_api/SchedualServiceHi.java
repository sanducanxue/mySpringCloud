package com.xusong.feign_api;

import com.xusong.hystric.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * describe :
 * author : xusong
 * createTime : 2018/7/19
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi extends HiApi{

}
