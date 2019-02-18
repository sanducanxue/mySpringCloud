package com.xusong.hystric;

import com.xusong.feign_api.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * describe :
 * author : xusong
 * createTime : 2018/7/19
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHi() {
        return "error";
    }
}
