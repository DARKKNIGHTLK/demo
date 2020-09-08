package com.javaboy.demo.dao;

import com.javaboy.demo.entity.MyTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface MytestRepository extends ElasticsearchRepository<MyTest, String> {

    Page<MyTest> findByName(String name, PageRequest pageRequest);
}
