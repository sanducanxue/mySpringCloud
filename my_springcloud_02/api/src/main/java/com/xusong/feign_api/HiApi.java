package com.xusong.feign_api;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * describe :
 * author : xusong
 * createTime : 2018/7/20
 */
public interface HiApi {
    @GetMapping("/hi")
    public String sayHi();
}
