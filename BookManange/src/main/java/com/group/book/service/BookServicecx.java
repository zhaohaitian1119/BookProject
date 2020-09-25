package com.group.book.service;

import com.group.book.pojo.Book;

import java.util.List;

public interface BookServicecx {
    //查询和分页
    List<Book> selectAll(int pageIndex,int pageSize);
    //删除
    int del(Integer id);

}
