package com.aaa.lee.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class BookController {

    @RequestMapping("/all")
    public List<String> selectAllString() {
        List<String> strList = new ArrayList<String>();
        String str = "12345678";
        strList.add(str);
        return strList;
    }

}
