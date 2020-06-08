package com.javaboy.demo.test.test.proxy;

import com.javaboy.demo.test.test.proxy.cglib.CglibProxy;

import java.lang.reflect.InvocationHandler;

public class Main {

    public static void main(String[] args) {
//        Star star = new StarImpl();
//        InvocationHandler invocationHandler = new StarProxy(star);
//        Star star1 = (Star)((StarProxy) invocationHandler).createProxy();
//        System.out.println(star1.dance("霹雳舞"));
//        System.out.println(star1.sing("笨小孩"));




            int times = 1000;

            Star ldh = new StarImpl();
            StarProxy proxy = new StarProxy();
            proxy.setTarget(ldh);

            long time1 = System.currentTimeMillis();
            Star star = (Star)proxy.createProxy();
            long time2 = System.currentTimeMillis();
            System.out.println("jdk创建时间：" + (time2 - time1));

            CglibProxy proxy2 = new CglibProxy();
            long time5 = System.currentTimeMillis();
            Star star2 = (Star)proxy2.CreatProxyedObj(StarImpl.class);
            long time6 = System.currentTimeMillis();
            System.out.println("cglib创建时间：" + (time6 - time5));

            long time3 = System.currentTimeMillis();
            for (int i = 1; i <= times; i++)
            {
                star.sing("ss");

                star.dance("ss");
            }
            long time4 = System.currentTimeMillis();
            System.out.println("jdk执行时间" + (time4 - time3));

            long time7 = System.currentTimeMillis();
            for (int i = 1; i <= times; i++)
            {
                star2.sing("ss");

                star2.dance("ss");
            }

            long time8 = System.currentTimeMillis();

            System.out.println("cglib执行时间" + (time8 - time7));
        }
}
