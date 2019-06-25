package com.yanglf.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author yanglf
 * @description
 * @since 2019/6/25
 **/
@Component
@Data
@ConfigurationProperties(prefix = "mybatis.db")
public class DBConfig {
    private String url;
    private String password;
    private String userName;
    private int minPoolSize;
    private int maxPoolSize;
    private int maxLifetime;
    private int borrowConnectionTimeout;
    private int loginTimeout;
    private int maintenanceInterval;
    private int maxIdleTime;
    private String testQuery;
}
