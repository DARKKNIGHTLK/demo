package com.javaboy.demo.service;

import com.javaboy.demo.entity.BookBean;
import com.javaboy.demo.entity.MyTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;

public interface MytestService {

    Optional<MyTest> findById(String id);

    MyTest save(MyTest blog);

    void delete(MyTest blog);

    Optional<MyTest> findOne(String id);

    Iterable<MyTest> findAll();

//    Page<MyTest> findByAuthor(String author, PageRequest pageRequest);

    Page<MyTest> findByName(String title, PageRequest pageRequest);
}
