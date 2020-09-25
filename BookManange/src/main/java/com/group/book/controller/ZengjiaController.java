package com.group.book.controller;

import com.group.book.pojo.Book;
import com.group.book.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;



@Controller
public class ZengjiaController {
    @Resource
    BookService bookService;

    @RequestMapping("/addBook")
    public String addBook(Book book, Model model){
        bookService.add(book);
        model.addAttribute("msg","添加成功");
        return "redirect:/selectAll";
    }

}