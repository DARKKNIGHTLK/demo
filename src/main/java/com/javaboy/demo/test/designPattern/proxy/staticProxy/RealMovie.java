package com.javaboy.demo.test.designPattern.proxy.staticProxy;

public class RealMovie implements Movie {

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("您正在观看电影 《肖申克的救赎》");
    }
}
