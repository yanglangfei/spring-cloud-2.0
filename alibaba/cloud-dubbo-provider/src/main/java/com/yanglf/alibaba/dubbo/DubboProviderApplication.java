package com.yanglf.alibaba.dubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
/**
 * @author yanglf
 * @description  @EnableDubbo 扫描包下的 @Service 类  @PropertySource 导入外部化配置文件
 * @since 2019/2/14
 **/
@SpringBootApplication
public class DubboProviderApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DubboProviderApplication.class,args);
    }

}
