package com.javaboy.demo.test;

import org.junit.Test;

import java.util.concurrent.TimeUnit;


public class Test2 extends Thread {

    @Override
    public void run() {
       for(int i = 0 ; i < 10; i++) {
           try {
               TimeUnit.MICROSECONDS.sleep(100);
           } catch (Exception e) {
               e.printStackTrace();
           }
           System.out.println("Test2");
       }
    }

    @Test
    public void test() {
        new Test2().start();
        for(int i = 0; i < 10; i++) {
            try {
                TimeUnit.MICROSECONDS.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("test");
        }
    }
}
