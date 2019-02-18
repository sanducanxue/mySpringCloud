package com.xusong.controller;

import com.xusong.feign_api.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * describe :
 * author : xusong
 * createTime : 2018/7/19
 */
@RestController
public class HiController {
    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping("hi")
    public String sayHi(){
        return schedualServiceHi.sayHi();

    }
}
