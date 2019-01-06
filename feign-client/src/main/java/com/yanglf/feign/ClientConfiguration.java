package com.yanglf.feign;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.boot.logging.LogLevel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yanglf
 * @sine 2018.12.30
 * @descriptipon
 * @see
 */
@Configuration
public class ClientConfiguration {

    @Bean
    public IRule rule(){
        return new BestAvailableRule();
    }

    @Bean
    public LogLevel logLevel(){
        return LogLevel.DEBUG;
    }

}
