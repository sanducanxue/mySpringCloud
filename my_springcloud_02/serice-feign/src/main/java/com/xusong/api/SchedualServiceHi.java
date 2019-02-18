package com.xusong.api;

import com.xusong.hystric.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * describe :
 * author : xusong
 * createTime : 2018/7/19
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @GetMapping("hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
