package com.javaboy.demo.service;

import com.javaboy.demo.entity.User;

public interface UserService {
    User getById(Integer id);

    /**
     * 保存
     * @param userName 名称
     */
    public void save(String userName);

    /**
     * 根据ID更新名称
     * @param userName 姓名
     * @param id 人员ID
     */
    public void update(String userName, Integer id);
}
