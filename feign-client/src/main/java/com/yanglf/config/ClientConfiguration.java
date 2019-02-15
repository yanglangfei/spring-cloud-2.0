package com.yanglf.config;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import feign.Contract;
import feign.Retryer;
import org.springframework.boot.logging.LogLevel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @author yanglf
 * @sine 2018.12.30
 * @descriptipon
 * @see
 */
@Configuration
public class ClientConfiguration {

    /**
     * 定义负载均衡规则
     * @return
     */
    @Bean
    public IRule rule(){
        return new BestAvailableRule();
    }

    /**
     * 定义日志级别
     * @return
     */
    @Bean
    public LogLevel logLevel(){
        return LogLevel.DEBUG;
    }

    /**
     * 使用Feign自己的注解，  @RequestLine("GET /user/getUser/{id}")
     * 使用springmvc的注解就会报错  @GetMapping (value = "/user/getUser/{id}")
     * @return
     */
    /*@Bean
    public Contract contract(){
        return new feign.Contract.Default();
    }*/


    /**
     * 配置重试机制  重试间隔 100ms, 最大重试时间 1s, 重试次数 5
     * @return
     */
    @Bean
    public Retryer retryer(){
        return new Retryer.Default(100,SECONDS.toMillis(1),5);
    }

}
