package com.yanglf.nacos.provider.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author yanglf
 * @sine 2019.01.13
 * @descriptipon
 * @see
 */
@Data
@Component
@ConfigurationProperties(prefix = "user")
@RefreshScope
public class User {
    private Integer id;
    private String name;
    private Integer age;
}
