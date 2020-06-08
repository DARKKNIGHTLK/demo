package com.javaboy.demo.test.designPattern.strategy;

/**
 * 比较策略
 * @param <T>
 */
@FunctionalInterface
public interface Comparator<T> {

    int compare(T o1,T o2);

}
