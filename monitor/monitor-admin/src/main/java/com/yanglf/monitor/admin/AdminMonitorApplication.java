package com.yanglf.monitor.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yanglf
 * @sine 2018.12.30
 * @descriptipon
 * @see
 */
@EnableEurekaClient
@EnableAdminServer
@SpringBootApplication
public class AdminMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminMonitorApplication.class, args);
    }
}
