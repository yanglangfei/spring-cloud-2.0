package com.yanglf.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yanglf
 * @sine 2018.12.30
 * @descriptipon
 * @see
 */
@SpringBootApplication
@EnableFeignClients
public class UserApplication {

    public static void main(String[] args){
        SpringApplication.run(UserApplication.class,args);
    }
}
