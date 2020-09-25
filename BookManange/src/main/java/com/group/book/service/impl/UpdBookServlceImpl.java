package com.group.book.service.impl;

import com.group.book.mapper.BookMapper;
import com.group.book.pojo.Book;
import com.group.book.service.UpdBookServlce;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("updBookServlceImpl")
public class UpdBookServlceImpl implements UpdBookServlce {
    @Resource
    BookMapper bookMapper;

    @Override
    public Book selectById(int id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Book b) {
         bookMapper.updateByPrimaryKey(b);
    }
}
