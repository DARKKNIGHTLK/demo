package com.javaboy.demo.test.designPattern.proxy.trendsProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GuitaiA implements InvocationHandler {

    private Object pingpai;


    public GuitaiA(Object pingpai) {
        this.pingpai = pingpai;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("销售开始  柜台是： "+this.getClass().getSimpleName());
        // 执行方法原方法
        method.invoke(pingpai, args);
        System.out.println("销售结束");
        return null;
    }

    /**
     * 通过反射获取代理对象
     * @return
     */
    public Object getPingpai() {
        return Proxy.newProxyInstance(pingpai.getClass().getClassLoader(), pingpai.getClass().getInterfaces(), this);
    }
}
