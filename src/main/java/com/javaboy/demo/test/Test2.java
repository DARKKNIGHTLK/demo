package com.javaboy.demo.test;

import org.junit.Test;

import javax.net.ssl.HttpsURLConnection;
import java.net.URL;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;


public class Test2 extends Thread {

    @Override
    public void run() {
       for(int i = 0 ; i < 10; i++) {
           try {
               TimeUnit.MICROSECONDS.sleep(100);
           } catch (Exception e) {
               e.printStackTrace();
           }
           System.out.println("Test2");
       }
    }

    @Test
    public void test() {
        new Test2().start();
        for(int i = 0; i < 10; i++) {
            try {
                TimeUnit.MICROSECONDS.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("test");
        }
    }


    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.chunqiusoft.cn");
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        connection.connect();
        for (Certificate certificate : connection.getServerCertificates()) {
            //第一个就是服务器本身证书，后续的是证书链上的其他证书
            X509Certificate x509Certificate = (X509Certificate) certificate;
            System.out.println(x509Certificate.getSubjectDN());
            System.out.println(x509Certificate.getNotBefore());//有效期开始时间
            System.out.println(x509Certificate.getNotAfter());//有效期结束时间
        }
        connection.disconnect();
    }

}
