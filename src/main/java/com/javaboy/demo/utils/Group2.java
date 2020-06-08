package com.javaboy.demo.utils;

import com.javaboy.demo.annotation.GroupBy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Group2<T> {
    private static volatile Group2 group;

    public static Group2 getInstance() {
        if(group == null) {
            synchronized (Group.class) {
                if(group == null) {
                    group = new Group2();
                }
            }
        }
        return group;
    }


//    public List<List<T>> groupBy(List<T> list) throws Exception {
//        //获取class对象
//        Class<?> clazz = list.get(0).getClass();
//        // 根据自定义注解获取分组字段的get方法
//        Method method = getMethode(clazz);
//        return groupByMethod(list,method);
//    }
//
//    private Method getMethode(Class clazz) {
//        Method[] methods = clazz.getMethods();
//        for(Method m : methods) {
//            GroupBy groupBy = m.getAnnotation(GroupBy.class);
//            if(groupBy != null) {
//                return m;
//            }
//        }
//        return null;
//    }
//
//        private List<List<T>> groupByMethod(List<T> list, Method method) {
//        List<List<T>> listList = new ArrayList<>();
//        List<String> strings = new ArrayList<>();
//        method.setAccessible(true);
//        list.forEach(obj -> {
//            try {
//                // 利用反射执行对象方法获取要进行比较的值
//                String str = method.invoke(obj).toString();
//                // 先将要分组的值进行过滤，过滤后list的size就是最终要分的组数
//                if(!strings.contains(str)) {
//                    strings.add(str);
//                }
//            } catch (Exception e1) {
//                e1.printStackTrace();
//            }
//        });
//        // 最后遍历strings，将list进行分组
//        strings.forEach(s -> {
//            // 每组新建一个list存放
//            List<T> objectList = new ArrayList<>();
//            list.forEach(obj -> {
//                try {
//                    String str = (String) method.invoke(obj);
//                    if (s.equals(str)) {
//                        objectList.add(obj);
//                    }
//                } catch (ClassCastException e) {
//                    String str = null;
//                    try {
//                        str = method.invoke(obj).toString();
//                    } catch (Exception e1) {
//                        e1.printStackTrace();
//                    }
//                    if (s.equals(str)) {
//                        objectList.add(obj);
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            });
//            listList.add(objectList);
//        });
//        return listList;
//    }
}
