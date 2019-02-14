package com.yanglf.user.controller;

import com.yanglf.user.model.TbAccount;
import com.yanglf.user.model.TbUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author yanglf
 * @description
 * @since 2019/2/14
 **/
@RestController
@RequestMapping("/account")
public class AccountController {

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public TbAccount info(Long userId){
        Date currentTime=new Date();
        return TbAccount.builder()
                .id(1L)
                .userId(userId)
                .amount(BigDecimal.valueOf(100))
                .createTime(currentTime)
                .modifyTime(currentTime).build();

    }
}
