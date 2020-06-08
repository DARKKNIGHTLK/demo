package com.javaboy.demo.test.designPattern.strategy;

public class Sorter<T> {

//    public static void sort(Comparable[] a) {
//        for (int i = 0; i < a.length - 1; i++) {
//            int minPos = i;
//            for (int j = i + 1; j < a.length; j++) {
//                minPos = a[j].compareTo(a[minPos]) == -1 ? j : minPos;
//            }
//            swap(a,i,minPos);
//        }
//    }

    public static<T> void sort(T[] arr,Comparator comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = comparator.compare(arr[j],arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr,i,minPos);
        }
    }

    static<T> void swap(T[] arr,int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
