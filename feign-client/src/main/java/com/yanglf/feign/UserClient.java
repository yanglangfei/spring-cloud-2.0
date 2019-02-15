package com.yanglf.feign;
import com.yanglf.config.ClientConfiguration;
import com.yanglf.feign.fallback.UserFallbackFactory;
import com.yanglf.user.model.TbUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yanglf
 * @sine 2018.12.30
 * @descriptipon
 * @see
 */
@FeignClient(value = "user-service",contextId = "user",path = "/user",configuration = ClientConfiguration.class,fallbackFactory = UserFallbackFactory.class)
public interface UserClient {

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    @GetMapping(value = "/info")
    TbUser info(@RequestParam("id") Long id);

}
