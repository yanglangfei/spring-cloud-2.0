package com.yanglf.albaba.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;

/**
 * @author yanglf
 * @description  @EnableDubbo 扫描包下的 @Service 类  @PropertySource 导入外部化配置文件
 * @since 2019/2/14
 **/
@EnableDubbo(scanBasePackages = "com.yanglf.albaba.dubbo.service")
@PropertySource(value = {"classpath:/provider-config.properties","classpath:/dubbo.properties"})
@SpringBootApplication
public class DubboProviderApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DubboProviderApplication.class,args);
    }

}
