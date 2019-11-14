package com.aaa.lee.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class RestFulTemplate {

    @Bean
    public RestTemplate restTemplate() {

        return new RestTemplate();
    }

}
