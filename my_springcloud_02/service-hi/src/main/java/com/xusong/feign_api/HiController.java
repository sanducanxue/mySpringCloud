package com.xusong.feign_api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * describe :
 * author : xusong
 * createTime : 2018/7/19
 */
@RestController
public class HiController implements HiApi{
    @Value("${server.port}")
    private String port;

    @Override
    public String sayHi() {
        return "i come from:" + port;
    }
}
