package com.yanglf.user.controller;

import com.yanglf.user.model.TbUser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author yanglf
 * @sine 2018.12.30
 * @descriptipon
 * @see
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public TbUser info(int id){
        Date currentTime=new Date();
        return TbUser.builder()
                .id(id)
                .userName("admin")
                .password("111111")
                .age(22)
                .address("陕西省西安市:"+port)
                .createTime(currentTime)
                .modifyTime(currentTime).build();

    }

}
