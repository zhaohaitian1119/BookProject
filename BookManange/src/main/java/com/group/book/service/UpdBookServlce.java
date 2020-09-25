package com.group.book.service;

import com.group.book.pojo.Book;

public interface UpdBookServlce {
  public Book selectById(int id);
  public void update(Book b);
}
