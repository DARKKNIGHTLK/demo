package com.javaboy.demo.utils;

import com.javaboy.demo.annotation.GroupBy;
import com.javaboy.demo.entity.User;
import org.junit.Test;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Group<T> {

    public static<T> List<List<T>> groupBy(List<T> list) throws Exception {
        //获取class对象
        Class<?> clazz = list.get(0).getClass();
        // 根据自定义注解获取分组字段的get方法
        Method method = getMethod(clazz);
        return groupByMethod(list,method);
    }

    private static Method getMethod(Class clazz) {
        Method[] methods = clazz.getMethods();
        for(Method m : methods) {
            GroupBy groupBy = m.getAnnotation(GroupBy.class);
            if(groupBy != null) {
                return m;
            }
        }
        return null;
    }

    private static<T> List<List<T>> groupByMethod(List<T> list, Method method) throws Exception {
        List<String> strings = new ArrayList<>();
        method.setAccessible(true);
        for(Object obj: list) {
            // 利用反射执行对象方法获取要进行比较的值
            String str = method.invoke(obj).toString();
            // 先将要分组的值进行过滤，过滤后list的size就是最终要分的组数
            if(!strings.contains(str)) {
                strings.add(str);
            }
        }

        List<List<T>> listList = new ArrayList<>();
        // 最后遍历strings，将list进行分组
        for(String str: strings) {
            // 每组新建一个list存放
            List<T> objectList = new ArrayList<>();
            for(Object obj: list) {
                String s = (String) method.invoke(obj);
                if (s.equals(str)) {
                    objectList.add((T) obj);
                }
            }
            listList.add(objectList);
        }
        return listList;
    }

    @Test
    public void test() throws Exception {
        List<User> userList = new ArrayList<>();
        User user1 = new User();
        user1.setName("刘大");
        user1.setProvince("浙江省");
        userList.add(user1);

        User user2 = new User();
        user2.setName("王二");
        user2.setProvince("江苏省");
        userList.add(user2);

        User user3 = new User();
        user3.setName("张三");
        user3.setProvince("浙江省");
        userList.add(user3);

        User user4 = new User();
        user4.setName("李四");
        user4.setProvince("山东省");
        userList.add(user4);

        User user5 = new User();
        user5.setName("王五");
        user5.setProvince("广东省");
        userList.add(user5);

        User user6 = new User();
        user6.setName("赵六");
        user6.setProvince("山东省");
        userList.add(user6);

        List<List<User>> list = groupBy(userList);
        System.out.println(list);
    }
}
