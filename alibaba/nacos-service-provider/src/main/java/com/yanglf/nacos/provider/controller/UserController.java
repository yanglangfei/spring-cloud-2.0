package com.yanglf.nacos.provider.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.fastjson.JSONObject;
import com.yanglf.nacos.provider.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanglf
 * @sine 2019.01.13
 * @descriptipon
 * @see
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private User user;

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    @SentinelResource(value = "user")
    public String  getUser(){
        user.setPort(port);
        return JSONObject.toJSONString(user);
    }
}
