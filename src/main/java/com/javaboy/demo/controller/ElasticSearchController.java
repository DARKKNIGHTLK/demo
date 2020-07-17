package com.javaboy.demo.controller;

import com.javaboy.demo.entity.BookBean;
import com.javaboy.demo.entity.User;
import com.javaboy.demo.service.BookService;
import com.javaboy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class ElasticSearchController {

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;


    @RequestMapping("/user/{id}")
    @ResponseBody
    public User getUserById(@PathVariable String id){
        Optional<User> opt =userService.findById(id);
        User user = opt.get();
        System.out.println(user);
        return user;
    }


    @RequestMapping("/book/{id}")
    @ResponseBody
    public BookBean getBookById(@PathVariable String id){
        Optional<BookBean> opt =bookService.findById(id);
        BookBean book=opt.get();
        System.out.println(book);
        return book;
    }

    @RequestMapping("/save")
    @ResponseBody
    public void Save(){
        BookBean book=new BookBean("1","ES入门教程","程裕强","2018-10-01");
        System.out.println(book);
        bookService.save(book);
    }
}
