package com.yanglf.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author yanglf
 * @sine 2019.01.06
 * @descriptipon  EnableDiscoveryClient   注册除了  eureka 以外的注册中心
 * @see
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MessageServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(MessageServiceApplication.class,args);
    }


    /**
     * LoadBalanced   添加该注解   使  rest 访问走注册中心
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
