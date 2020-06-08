package com.javaboy.demo.test.designPattern.factory;

/**
 * 简单工厂
 * 可扩展性不好
 */
public class SimpleVehicleFactory {

    public Car createCar() {
        //before processing
        return new Car();
    }

    public Plane createPlane() {
        //before processing
        return new Plane();
    }

}
