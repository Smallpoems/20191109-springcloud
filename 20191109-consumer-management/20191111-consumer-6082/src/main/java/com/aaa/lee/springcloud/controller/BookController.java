package com.aaa.lee.springcloud.controller;

import com.aaa.lee.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
public class BookController {


    private static final String URL = "http://BOOK-PROVIDER/";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private  LoadBalancerClient loadBalancerClient;

    @GetMapping("/all")
    public List<Book> selectAllBooks() {

        return restTemplate.getForObject(URL + "all", List.class);
    }
    @GetMapping("/allLB")
    public List<Book> selectUsersByLoadBalance(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("book-provider");

        String host = serviceInstance.getHost();
        System.out.println(host);

        int port = serviceInstance.getPort();
        System.out.println(port);
        return restTemplate.getForObject("http://"+host+":"+port+"/all", List.class);

    }

}
