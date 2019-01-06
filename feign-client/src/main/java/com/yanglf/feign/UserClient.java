package com.yanglf.feign;
import com.yanglf.user.model.TbUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yanglf
 * @sine 2018.12.30
 * @descriptipon
 * @see
 */
@FeignClient(value = "user-service",path = "/user",configuration = ClientConfiguration.class,fallback = UserClientFallback.class)
public interface UserClient {

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    TbUser info(@RequestParam("id") int id);

}
