package com.javaboy.demo.test.nettynio;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketIO {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(9090);

        System.out.println("step1: new ServerSocket(8090)");

        Socket client = server.accept();
        System.out.println("step:client\t" + client.getPort());

        InputStream in = client.getInputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        System.out.println(reader.readLine());

        while (true) {

        }
    }
}
