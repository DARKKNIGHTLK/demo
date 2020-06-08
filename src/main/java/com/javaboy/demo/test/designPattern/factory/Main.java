package com.javaboy.demo.test.designPattern.factory;

public class Main {
    public static void main(String[] args) {
        Moveable m = new CarFactory().create();
        m.go();
    }
}
