package com.aaa.lee.springcloud.controller;


import com.aaa.lee.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;


@RestController
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping("/all")
    public List<Book> selectAllBooks() throws Exception {
        List<Book> bookList = bookService.selectAll();
        if(bookList.size() > 0) {
            throw new Exception("假设熔断处理");
        }
        return bookList;
    }



}
