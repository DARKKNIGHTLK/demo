package com.javaboy.demo.service.serviceImpl;


import com.javaboy.demo.dao.MytestRepository;
import com.javaboy.demo.entity.BookBean;
import com.javaboy.demo.entity.MyTest;
import com.javaboy.demo.service.MytestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MytestServiceImpl implements MytestService {

    @Autowired
    @Qualifier("mytestRepository")
    private MytestRepository mytestRepository;

    @Override
    public Optional<MyTest> findById(String id) {
        //CrudRepository中的方法
        return mytestRepository.findById(id);
    }

    @Override
    public MyTest save(MyTest blog) {
        return mytestRepository.save(blog);
    }

    @Override
    public void delete(MyTest blog) {
        mytestRepository.delete(blog);
    }

    @Override
    public Optional<MyTest> findOne(String id) {
        return mytestRepository.findById(id);
    }

    @Override
    public Iterable<MyTest> findAll() {
        return mytestRepository.findAll();
    }

//    @Override
//    public Page<MyTest> findByAuthor(String author, PageRequest pageRequest) {
//        return mytestRepository.findByAuthor(author,pageRequest);
//    }

    @Override
    public Page<MyTest> findByName(String name, PageRequest pageRequest) {
        return mytestRepository.findByName(name,pageRequest);
    }
}
