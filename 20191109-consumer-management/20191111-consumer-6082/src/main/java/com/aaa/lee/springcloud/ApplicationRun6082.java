package com.aaa.lee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
//@RibbonClient(name = "BOOK-PROVIDER", configuration = RibbonRuleMine.class)
public class ApplicationRun6082 {

    public static void main(String[] args) {

        SpringApplication.run(ApplicationRun6082.class, args);
    }

}
