package com.javaboy.demo.test.designPattern.proxy.staticProxy;

public class ProxyTest {

    public static void main(String[] args) {
        RealMovie realmovie = new RealMovie();
        Movie movie = new Cinema(realmovie);
        movie.play();
    }
}
