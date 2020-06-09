package com.javaboy.demo.utils;

import org.springframework.stereotype.Component;

@Component
public class PropertiesHa extends java.util.Properties {

    private static String username;

    private static int age;

    private static String sex;

    static {
        System.out.println("自动装配start");
    }

}
