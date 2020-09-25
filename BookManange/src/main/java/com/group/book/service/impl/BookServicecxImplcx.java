package com.group.book.service.impl;

import com.group.book.mapper.BookMapper;
import com.group.book.pojo.Book;
import com.group.book.service.BookServicecx;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("bookService")
public class BookServicecxImplcx implements BookServicecx {
    @Resource
    BookMapper bookMapper;

    //实现查询分页
    @Override
    public List<Book> selectAll(int pageIndex, int pageSize) {
        return bookMapper.selectByExample(null);
    }

    //实现删除
    @Override
    public int del(Integer id) {
        return bookMapper.deleteByPrimaryKey(id);
    }
}
