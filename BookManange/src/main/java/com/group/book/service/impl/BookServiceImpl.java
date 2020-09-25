package com.group.book.service.impl;


import com.group.book.mapper.BookMapper;
import com.group.book.pojo.Book;
import com.group.book.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("bookServicezsy")
public class BookServiceImpl implements BookService {
    @Resource
    BookMapper bookMapper;

    @Override
    public void add(Book book) {
        bookMapper.insertSelective(book);
    }
}
