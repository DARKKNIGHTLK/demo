package com.javaboy.demo.dao;

import com.javaboy.demo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.Optional;

public interface UserRepository extends ElasticsearchRepository<User, String> {

//    Optional<User> findById(String id);
//
//    Page<User> findByAuthor(String author, Pageable pageable);
//
//    Page<User> findByTitle(String title, Pageable pageable);
}
