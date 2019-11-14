package com.aaa.lee.springcloud.service;

import com.aaa.lee.springcloud.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;


@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    /**
     * 查询信息
     * @return
     */

    public List<Book> selectAll() {

        return bookMapper.selectAll();
    }

}
