package com.group.book.controller;

import com.group.book.service.LoginServicezht;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author shkstart
 * @create 2020-09-25 11:34
 */
@Controller
@RequestMapping("/zht")
public class LoginControllerzht {

    @Resource
    LoginServicezht loginServicezht;

    @RequestMapping("/")
    public String tologin(){
        return "login";
    }

    @RequestMapping("/dologin")
    public String dologin(HttpServletRequest request, Model model){
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        int i = loginServicezht.loginByNamePassWord(name, password);
        if(i>0){
            return "redidect:selectAll";
        }else{
            model.addAttribute("error","用户名或密码错误!");
            return "login";
        }


    }
}
