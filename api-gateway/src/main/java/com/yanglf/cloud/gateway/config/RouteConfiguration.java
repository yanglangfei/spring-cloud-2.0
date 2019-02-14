package com.yanglf.cloud.gateway.config;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.cloud.gateway.filter.factory.StripPrefixGatewayFilterFactory;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @author yanglf
 * @description
 * @since 2018/12/25
 **/
@Configuration
public class RouteConfiguration {

    @Bean
    @ConditionalOnExpression("${define.route.prod}")
    public RouteLocator prodRouteLocator(RouteLocatorBuilder builder) {
        StripPrefixGatewayFilterFactory.Config config = new StripPrefixGatewayFilterFactory.Config();
        config.setParts(1);
        return builder.routes()
                .route("user", r -> r.path("/user/**").uri("lb://user-service"))
                .route("order", r -> r.path("/order-auth/**").uri("lb://order-service"))
                .build();
    }

}
