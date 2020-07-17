package com.javaboy.demo.entity;

import com.javaboy.demo.annotation.GroupBy;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

//@Component
@Document(indexName = "user", type = "user")
public class User {
    @Id
    private Integer id;

//    @Value("${user.username}")
    private String name;

    private String province;

//    @Value("${user.age}")
    private int age;

//    @Value("${user.sex}")
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @GroupBy
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
