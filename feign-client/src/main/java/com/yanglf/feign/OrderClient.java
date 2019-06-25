package com.yanglf.feign;
import com.yanglf.order.model.vo.OrderVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author yanglf
 * @description  account client  新版本使用  contextId 来区分同一个service中的不同client
 * @since 2019/2/14
 **/
@FeignClient(value = "order-service",contextId = "order",path = "/order")
public interface OrderClient {


    /**
     * @param id
     * @return
     */
    @RequestMapping(value = "/findById/{id}",method = RequestMethod.GET)
    OrderVo findById(@PathVariable(value = "id") Long id);
}
