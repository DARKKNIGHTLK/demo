package com.javaboy.demo.dao;

import com.javaboy.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    /**
     * 根据id获取
     * @param id
     * @return
     */
    User getById(@Param("id") Integer id);

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
