package com.javaboy.demo.test.designPattern.proxy.trendsProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        SellWine maotaijiu = new MaotaiJiu();
        InvocationHandler jingxiao1 = new GuitaiA(maotaijiu);
        SellWine dynamicProxy = (SellWine) ((GuitaiA) jingxiao1).getPingpai();
        dynamicProxy.mainJiu();
        dynamicProxy.mainJiu2();
        InvocationHandler jingxiao2 = new GuitaiA(new Furongwang());
        SellCigarette dynamicProxy2 = (SellCigarette)((GuitaiA) jingxiao2).getPingpai();
        dynamicProxy2.sell();

        // 这一句跟我们的动态代理有些相似，都是传入一个接口
//        GankService gankService = retrofit.create(GankService.class);
    }
}
