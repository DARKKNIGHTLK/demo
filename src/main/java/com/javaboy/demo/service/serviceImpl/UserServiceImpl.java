package com.javaboy.demo.service.serviceImpl;

import com.javaboy.demo.dao.UserDao;
import com.javaboy.demo.dao.UserRepository;
import com.javaboy.demo.entity.User;
import com.javaboy.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;


@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userRepository")
    private UserRepository userRepository;


    @Override
    public Optional<User> findById(String id) {
        //CrudRepository中的方法
        return userRepository.findById(id);
    }

    @Override
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    @Resource
    private UserDao userDao;

    @Override
    public User getById(Integer id) {
        return userDao.getById(id);
    }


    @Override
    public User getByUserName(String userName) {
        return userDao.getByUserName(userName);
    }

    @Override
    public void save(String userName) {
        log.info(userName);
        userDao.save(userName);
    }

    @Override
    public void update(String userName, Integer id) {
        userDao.update(userName,id);
    }

}
