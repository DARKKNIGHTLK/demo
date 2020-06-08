package com.javaboy.demo.dao;

import com.javaboy.demo.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysLogDao {
    void save(SysLogEntity sysLog);
}
