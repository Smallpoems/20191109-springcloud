package com.aaa.lee.springcloud.controller;

import com.aaa.lee.springcloud.model.Book;
import com.aaa.lee.springcloud.service.ISpringcloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;




@RestController
public class BookController {

    @Autowired
    private ISpringcloudService springcloudService;

    @RequestMapping("/all")
    public List<Book> selectAllBooks() {
        return springcloudService.selectAllBooks();
    }

}
