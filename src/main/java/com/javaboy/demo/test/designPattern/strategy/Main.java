package com.javaboy.demo.test.designPattern.strategy;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//       Comparable[] comparables = {new Dog(8),new Dog(9),new Dog(1),new Dog(2),new Dog(5)};
//       Sorter.sort(comparables);
//       System.out.println(Arrays.toString(comparables));

        Cat[] cats = {new Cat(8,8),new Cat(5,5),new Cat(9,9),new Cat(2,2)};
        Sorter.sort(cats,new CatHeightComparator());
        System.out.println(Arrays.toString(cats));
    }
}
