package com.javaboy.demo.entity;

import com.javaboy.demo.annotation.GroupBy;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Accessors
@Data
@Document(indexName = "user", type = "user")
public class User {
    @Id
    private Integer id;

    private String name;

    private String province;

    private int age;

    private String sex;

    @GroupBy
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }


}
