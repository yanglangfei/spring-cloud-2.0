package com.yanglf.order.controller;

import com.yanglf.feign.UserClient;
import com.yanglf.order.model.vo.OrderVo;
import com.yanglf.user.model.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.UUID;

/**
 * @author yanglf
 * @sine 2018.12.30
 * @descriptipon
 * @see
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private UserClient userClient;

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public OrderVo info(int id){
        TbUser tbUser = userClient.info(id);
        return OrderVo.builder()
                .id(id)
                .orderCode(UUID.randomUUID().toString().replace("-",""))
                .status(1)
                .userName(tbUser.getAddress())
                .createTime(new Date())
                .build();
    }

}
