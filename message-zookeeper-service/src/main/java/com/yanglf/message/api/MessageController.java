package com.yanglf.message.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
/**
 * @author yanglf
 * @sine 2019.01.06
 * @descriptipon
 * @see
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list() {
        String url = "http://order-service/order/list";
        return restTemplate.getForObject(url, String.class);
    }

}
