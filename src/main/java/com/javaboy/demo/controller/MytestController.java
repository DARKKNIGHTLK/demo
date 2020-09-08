package com.javaboy.demo.controller;

import com.javaboy.demo.entity.MyTest;
import com.javaboy.demo.entity.User;
import com.javaboy.demo.service.MytestService;
import com.javaboy.demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@RequestMapping("/mytest")
public class MytestController {

    @Autowired
    private MytestService mytestService;


    @RequestMapping("/getById")
    public MyTest getById(String id) {
        Optional<MyTest> opt = mytestService.findById(id);
        MyTest myTest = opt.get();
        return myTest;
    }

    @RequestMapping("/getName")
    @ResponseBody
    public List<MyTest> getName(String name) {
        Page<MyTest> opt = mytestService.findByName(name, PageRequest.of(0,10));
        List<MyTest> myTestList = (List<MyTest>)opt.getContent();
        return myTestList;
    }

    @RequestMapping("/save")
    public MyTest save(@RequestBody MyTest myTest) {
       return mytestService.save(myTest);
    }

    @RequestMapping("/findAll")
    public Iterable<MyTest> findAll() {
        Iterable<MyTest> myTestList = mytestService.findAll();
        return myTestList;
    }

//    @RequestMapping("/deleteIndex")
//    public R deleteIndex() {
//
//    }
}
