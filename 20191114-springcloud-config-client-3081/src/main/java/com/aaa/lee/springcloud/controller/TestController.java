package com.aaa.lee.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("$(server.post)")
    private String port;

    @Value("$(spring.datasource.driver-class-name)")
    private  String driverClassName;

    @Value("$(mybatis.type-aliases-package)")
    private String mybatisTypePackage;

    @RequestMapping("/test")
    public String test(){

        return  port +"---------------" + driverClassName + "---------------" + mybatisTypePackage;
    }





}
