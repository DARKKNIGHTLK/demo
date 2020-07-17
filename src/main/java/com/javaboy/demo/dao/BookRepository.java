package com.javaboy.demo.dao;

import com.javaboy.demo.entity.BookBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.Optional;

public interface BookRepository extends ElasticsearchRepository<BookBean, String> {

    Optional<BookBean> findById(String id);

    Page<BookBean> findByAuthor(String author, Pageable pageable);

    Page<BookBean> findByTitle(String title, Pageable pageable);
}
