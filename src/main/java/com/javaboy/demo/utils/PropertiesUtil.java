package com.javaboy.demo.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

@Configuration
public class PropertiesUtil {
    private static Properties _prop = new Properties();

    /**
     * 读取配置文件
     * @param
     */
    @Bean
    private static void readProperties(){
        try {
            InputStream in = PropertiesUtil.class.getResourceAsStream("/properties.properties");
            BufferedReader bf = new BufferedReader(new InputStreamReader(in));
            _prop.load(bf);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * 根据key读取对应的value
     * @param key
     * @return
     */
    public static String getProperty(String key){
        return _prop.getProperty(key);
    }

}
