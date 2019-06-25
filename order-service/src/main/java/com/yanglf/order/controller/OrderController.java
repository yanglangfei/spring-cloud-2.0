package com.yanglf.order.controller;
import com.yanglf.feign.AccountClient;
import com.yanglf.feign.UserClient;
import com.yanglf.order.model.vo.OrderVo;
import com.yanglf.user.model.TbAccount;
import com.yanglf.user.model.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
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

    @Autowired
    private AccountClient accountClient;

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public OrderVo info(Long userId){
        TbAccount tbAccount = accountClient.info(userId);
        TbUser tbUser = userClient.info(userId);
        return OrderVo.builder()
                .id(1L)
                .amount(tbAccount.getAmount())
                .orderCode(UUID.randomUUID().toString().replace("-",""))
                .status(1)
                .userId(userId)
                .userName(tbUser.getUserName())
                .createTime(new Date())
                .build();
    }


    @RequestMapping(value = "/findById/{id}",method = RequestMethod.GET)
    public OrderVo findById(@PathVariable(value = "id") Long id){
        return OrderVo.builder().createTime(new Date()).orderCode(UUID.randomUUID().toString())
                .status(2)
                .id(id)
                .amount(BigDecimal.valueOf(20))
                .build();
    }

}
