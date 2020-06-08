package com.javaboy.demo.test.designPattern.factory.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbastraFactory factory = new ModernFactory();//指定产品族工厂

        Food food = factory.createFood();
        Vehicle vehicle = factory.createVehicle();
        Weapon weapon = factory.createWeapon();
    }
}
