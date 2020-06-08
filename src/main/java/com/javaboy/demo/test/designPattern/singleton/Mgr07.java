package com.javaboy.demo.test.designPattern.singleton;

/**
 * 不仅可以解决线程同步，还可以防止反序列化
 */
public enum Mgr07 {

    INSTANCE;

    public void m() {
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i ++) {
            new Thread(() -> {
                System.out.println(Mgr07.INSTANCE.hashCode());
            }).start();
        }
    }
}
