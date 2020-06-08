package com.javaboy.demo.test.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarProxy implements InvocationHandler {

    private Star target;

//    public StarProxy(Star star) {
//        this.target = star;
//    }

    public void setTarget(Star target)
    {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("签合同");
        Object o = method.invoke(target,args);
        System.out.println("收钱");
        return o;
    }

    public Object createProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
