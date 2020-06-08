package com.javaboy.demo.test.thread;

public class Test4 {
    private volatile static boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (running) {
            }
            System.out.println(running);
        },"t1").start();

        Thread.sleep(1000);
        running = false;
    }
//    private static boolean ready = false;
//    private static int number = 0;
//
//    private static class ReaderThread extends Thread {
//        @Override
//        public void run() {
//            while (!ready) {
//                Thread.yield(); //交出CPU让其它线程工作
//            }
//            System.out.println(number);
//        }
//    }
//
//    public static void main(String[] args) {
//        new ReaderThread().start();
//        number = 42;
//        ready = true;
//    }

    }
