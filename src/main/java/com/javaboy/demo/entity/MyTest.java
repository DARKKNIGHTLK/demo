package com.javaboy.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "mytest", type = "user",shards = 1,replicas = 0)
public class MyTest {
    @Id
    private Long id;

    private String name;

    private String age;

    private String sex;
}
