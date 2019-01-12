package com.yanglf.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yanglf
 * @sine 2019.01.12
 * @descriptipon
 * @see
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties
public class NacosProviderApplication {

    public static void main(String[] args){
        SpringApplication.run(NacosProviderApplication.class,args);
    }

}
