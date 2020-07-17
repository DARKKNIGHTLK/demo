package com.javaboy.demo.test;

import com.javaboy.demo.annotation.SysLog;
import com.javaboy.demo.controller.UserController;
import com.javaboy.demo.annotation.Zhujie;
import com.javaboy.demo.service.UserService;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

    @Test
    public void test() throws Exception {
        UserController userController = new UserController();
        Class<? extends UserController> clazz = userController.getClass();
        Field[] fileds = clazz.getDeclaredFields();
        Field serviceFiled = clazz.getDeclaredField("userService");
        serviceFiled.setAccessible(true);
        String name = serviceFiled.getName();
        name = name.substring(0,1).toUpperCase() + name.substring(1,name.length());
        String setMethodName = "set" + name;
        Method method = clazz.getMethod(setMethodName,UserService.class);
//        method.invoke(userController,userService);
//        System.out.println(userController.getUserService());
//        User user = userController.getUserService().getById(1);
//        System.out.println(user);
    }

    @Test
    public void test2() throws ClassNotFoundException {
        UserController userController = new UserController();
        Class<? extends UserController> clazz = userController.getClass();
        Class<?> aClass = Class.forName("com.javaboy.demo.controller.UserController");
        Stream.of(clazz.getDeclaredFields()).forEach(field -> {
            String name = field.getName();
            System.out.println(name);
            Zhujie zhujie = field.getAnnotation(Zhujie.class);
            if(zhujie != null) {
                field.setAccessible(true);
                Class<?> type = field.getType();
                System.out.println(type.getName());
                try {
                    Object o = type.newInstance();
                    field.set(userController,o);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
    }


    @Test
    public void test3() {
        Integer[] a = {1,2,3,4};
        List<String> stringList = Arrays.asList("a","b","c","d","","1").stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        List<Integer> a1 = Arrays.asList(a);
        List<Integer> outList =a1.stream().map(n -> n * n)
                .collect(Collectors.toList());
    }

    @Test
    public void test4() {
        for(Method m: UserController.class.getMethods()) {
            if(m.isAnnotationPresent(SysLog.class)) {
                SysLog sysLog = m.getAnnotation(SysLog.class);
                System.out.println(sysLog.value());
            }
        }
    }

}
