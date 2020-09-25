package com.group.book.controller;

import com.group.book.pojo.Book;
import com.group.book.service.UpdBookServlce;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("sjl")
public class UpdBookControllersjl {
    @Resource
    UpdBookServlce updBookServlce;
    @RequestMapping("/upd/{id}")
    public String updcha(Model model,@PathVariable int id){
        Book b=updBookServlce.selectById(id);
        model.addAttribute("user",b);
        return "update";
    }
    @RequestMapping("/updBook/{id}")
    public String updbook(@PathVariable int id, String name, String author, String publish, int page, double price, String content, HttpSession session){
        Book b=new Book();
        b.setId(id);
        b.setName(name);
        b.setAuthor(author);
        b.setPublish(publish);
        b.setPublishdate(new Date());
        b.setPage(page);
        b.setPrice(price);
        b.setContent(content);
        updBookServlce.update(b);
        //session.setAttribute("del","");
        return "redirect:/selectAll";
    }


}
