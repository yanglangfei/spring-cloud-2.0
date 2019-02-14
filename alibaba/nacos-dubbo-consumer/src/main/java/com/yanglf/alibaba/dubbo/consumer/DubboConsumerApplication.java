package com.yanglf.alibaba.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.yanglf.albaba.dubbo.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;

/**
 * @author yanglf
 * @description
 * @since 2019/2/14
 **/
@EnableDubbo
@PropertySource(value = {"classpath:/consumer-config.properties","classpath:/dubbo.properties"})
@SpringBootApplication
@Slf4j
public class DubboConsumerApplication {

    @Reference(version = "${provider.service.version}")
    private HelloService helloService;

    @PostConstruct
    public void initService(){
        String salHello = helloService.salHello("yanglf");
        log.info("sayHello:{}",salHello);
    }



    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}
