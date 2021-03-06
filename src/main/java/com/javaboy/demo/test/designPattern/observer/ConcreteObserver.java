package com.javaboy.demo.test.designPattern.observer;

/**
 * 具体观察者
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update() {
        System.out.println("ConcreteObserver收到消息，进行处理");
    }
}
