package com.aaa.lee.springcloud.service;

import com.aaa.lee.springcloud.fallback.ISpringcloudFallbackFactory;
import com.aaa.lee.springcloud.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@FeignClient(value = "BOOK-PROVIDER", fallbackFactory = ISpringcloudFallbackFactory.class)
public interface ISpringcloudService {

    @RequestMapping("/all")
    List<Book> selectAllBooks();

}
