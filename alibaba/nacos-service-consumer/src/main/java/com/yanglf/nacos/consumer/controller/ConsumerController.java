package com.yanglf.nacos.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanglf
 * @sine 2019.01.13
 * @descriptipon
 * @see
 */
@RestController
public class ConsumerController {

    @Autowired
    private UserFeign userFeign;

    @RequestMapping("/")
    public String getProviderInfo(){
        return userFeign.getUserInfo();
    }



    @FeignClient(value = "provider",path = "/user")
    public interface  UserFeign{

        @RequestMapping("/info")
        String  getUserInfo();

    }

}
