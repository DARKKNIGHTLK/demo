package com.javaboy.demo.service.serviceImpl;

import com.javaboy.demo.service.PersonService;

public class PersonServiceImpl implements PersonService {

    private String user = null;

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public PersonServiceImpl() {    }

    public PersonServiceImpl(String user){
        this.user = user;
    }

    @Override
    public void save(String name) {
        System.out.println("我是save方法");
    }

    @Override
    public void update(String name, Integer personId) {
        System.out.println("我是update方法");
    }

    @Override
    public String getPersonName(Integer personId) {
        System.out.println("我是getPersonName方法");
        return "xxx";
    }
}
