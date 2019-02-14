package com.yanglf.nacos.provider;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import lombok.extern.slf4j.Slf4j;
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
@NacosConfigurationProperties(dataId = "mysql.config")
@Slf4j
public class NacosProviderApplication{

    public static void main(String[] args){
        SpringApplication.run(NacosProviderApplication.class,args);
    }
}
