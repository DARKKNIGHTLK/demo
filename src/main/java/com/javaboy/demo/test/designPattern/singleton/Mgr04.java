package com.javaboy.demo.test.designPattern.singleton;


/**
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 通过synchronized解决，但也带来效率下降
 */
public class Mgr04 {

    private static Mgr04 INSTENCE;

    private Mgr04(){}

    public static synchronized Mgr04 getInstance() {
        if(INSTENCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTENCE = new Mgr04();
        }
        return INSTENCE;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }
}
