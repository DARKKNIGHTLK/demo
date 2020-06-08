package com.javaboy.demo.test.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的几种方式
 */
public class Test3 {

    /**
     * 继承Thread类
     */
    static class MyThresd extends Thread {
        @Override
        public void run() {
            System.out.println("Hello MyThread!");
        }
    }

    /**
     * 实现Runnable接口
     */
    static class MyRun implements Runnable{
        @Override
        public void run() {
            System.out.println("Hello MyRun!");
        }
    }

    /**
     * 实现Callable接口
     * 此接口允许抛出异常，允许有返回值
     */
    static class MyCall implements Callable {

        @Override
        public Object call() throws Exception {
            System.out.println("Hello Callable!");
            return "success";
        }
    }

    public static void main(String[] args) throws Exception {
        new MyThresd().start();
        new Thread(new MyRun()).start();
        new Thread(() -> {
            System.out.println("Hello Lambda!");
        }).start();
        FutureTask<String> objectFutureTask = new FutureTask<String>(new MyCall());
        Thread t = new Thread(objectFutureTask);
        t.start();
        String s  = objectFutureTask.get();
        System.out.println(s);
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> {
            System.out.println("Hello ThreadPool!");
        });
        service.shutdown();
    }


}
