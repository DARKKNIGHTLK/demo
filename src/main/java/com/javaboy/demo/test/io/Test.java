package com.javaboy.demo.test.io;

import java.io.*;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }

    @org.junit.Test
    public void test() {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name");
        String name = in.next();
        System.out.println(name);
    }
}
