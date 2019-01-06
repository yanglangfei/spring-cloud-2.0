package com.yanglf.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yanglf
 * @sine 2019.01.06
 * @descriptipon
 * @see
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PlatformServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(PlatformServiceApplication.class,args);
    }

}
