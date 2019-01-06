package com.yanglf.monitor.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yanglf
 * @sine 2018.12.30
 * @descriptipon
 * @see
 */
@SpringBootApplication
@EnableAdminServer
public class AdminMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminMonitorApplication.class, args);
    }
}
