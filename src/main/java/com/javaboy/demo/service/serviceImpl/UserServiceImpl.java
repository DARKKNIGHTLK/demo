package com.javaboy.demo.service.serviceImpl;

import com.javaboy.demo.dao.UserDao;
import com.javaboy.demo.entity.User;
import com.javaboy.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User getById(Integer id) {
        return userDao.getById(id);
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
