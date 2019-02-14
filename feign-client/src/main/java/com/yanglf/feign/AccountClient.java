package com.yanglf.feign;

import com.yanglf.user.model.TbAccount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yanglf
 * @description  account client  新版本使用  contextId 来区分同一个service中的不同client
 * @since 2019/2/14
 **/
@FeignClient(value = "user-service",contextId = "account",path = "/account",configuration = ClientConfiguration.class,fallback = UserClientFallback.class)
public interface AccountClient {

    /**
     * query account into
     * @param userId user id
     * @return  TbAccount
     */
    @GetMapping(value = "/info")
    TbAccount info(@RequestParam("userId") Long userId);
}
