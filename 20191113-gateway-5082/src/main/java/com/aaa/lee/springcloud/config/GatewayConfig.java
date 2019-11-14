package com.aaa.lee.springcloud.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

   @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder) {

       return routeLocatorBuilder.routes()
               .route("baidu-route",
                       p -> p.path("/jd").
                               filters(f -> f
                            .addRequestHeader
                       ("name", "zhangsan"))
                               .uri("https://www.jd.com/"))
               .build();
   }
}
