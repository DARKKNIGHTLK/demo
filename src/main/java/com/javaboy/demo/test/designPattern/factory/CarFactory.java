package com.javaboy.demo.test.designPattern.factory;

public class CarFactory {

    public Moveable create() {
        System.out.println("a car created!");
        return new Car();
    }
}
