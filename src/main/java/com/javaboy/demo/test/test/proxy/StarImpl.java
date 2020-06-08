package com.javaboy.demo.test.test.proxy;

public class StarImpl implements Star {

    @Override
    public String sing(String name) {
        System.out.println("正在演唱" + name);
        return "演唱结束";
    }

    @Override
    public String dance(String name) {
        System.out.println("正在表演" + name);
        return "表演结束";
    }
}
