package com.group.book.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.group.book.pojo.Book;
import com.group.book.service.BookServicecx;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class BookControllercx {
    @Resource
    BookServicecx bookServicecx;

    //查询分页功能
    @RequestMapping("/selectAll")
    public String selectAll(HttpServletRequest request, Model model){
        int Num=1;
        String pageNum=request.getParameter("pageNum");
        if(pageNum!=null){
            Num=Integer.parseInt(pageNum);
        }
        int pageSize=3;
        PageHelper.orderBy("id asc");
        PageHelper.startPage(Num,pageSize);
        List<Book> books = bookServicecx.selectAll(Num, pageSize);
        PageInfo<Book> bookPageInfo=new PageInfo<>(books);
        model.addAttribute("bookPageInfo",bookPageInfo);
        return "indexcx";
    }

    //删除功能
    @RequestMapping("/del")
    public String del(int id){
        bookServicecx.del(id);
        return "redirect:selectAll";
    }

}
