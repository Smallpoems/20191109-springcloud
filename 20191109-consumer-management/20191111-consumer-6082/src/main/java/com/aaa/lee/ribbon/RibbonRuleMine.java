package com.aaa.lee.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RibbonRuleMine {

    @Bean
    public IRule randomRule() {

        return new RandomRule();
    }

}
