package com.javaboy.demo.test.designPattern.observer;

/**
 * 具体主题
 */
public class ConcreteSubject extends Subject {

    //具体业务
    public void doSomething() {
        //...
        super.notifyObserver();
    }
}
