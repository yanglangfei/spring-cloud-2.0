package com.yanglf.order.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.yanglf.order.interceptor.RequestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

/**
 * @author yanglf
 * @description
 * @since 2019/2/15
 **/
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(new RequestInterceptor());
    }


    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        // 配置消息转换格式
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig=new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.WriteNullListAsEmpty,
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteNullStringAsEmpty,
                SerializerFeature.PrettyFormat);
        converter.setFastJsonConfig(fastJsonConfig);
        converters.add(converter);
    }


    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 跨域配置
        registry.addMapping("/pro/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods("GET")
                .maxAge(3600 * 24);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //   自定义资源映射目录
        registry.addResourceHandler("/img/**").addResourceLocations("classpath:/image/");
        //registry.addResourceHandler("/file/image/**").addResourceLocations("file:D:/image/");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 配置视图跳转控制器
        registry.addRedirectViewController("/html","/static/index.html");
        registry.addRedirectViewController("/pdf","/static/index.pdf");
    }
}
