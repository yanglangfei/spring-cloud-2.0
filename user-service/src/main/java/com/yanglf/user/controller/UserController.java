package com.yanglf.user.controller;

import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.yanglf.feign.OrderClient;
import com.yanglf.order.model.vo.OrderVo;
import com.yanglf.user.model.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
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

    @Autowired
    private OrderClient orderClient;


    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public TbUser info(Long id){
        Date currentTime=new Date();
        return TbUser.builder()
                .id(id)
                .userName("admin")
                .password("111111")
                .age(22)
                .address("陕西省西安市:")
                .createTime(currentTime)
                .modifyTime(currentTime).build();

    }


    @RequestMapping(value = "/userOrder",method = RequestMethod.GET)
    @LcnTransaction(propagation = DTXPropagation.SUPPORTS)
    @Transactional
    public TbUser userOrder(Long id){
        OrderVo orderVo = orderClient.findById(id);
        return null;
    }




}
