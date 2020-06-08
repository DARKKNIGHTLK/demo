package com.javaboy.demo.service;

import com.javaboy.demo.annotation.SysLog;
import com.javaboy.demo.entity.SysLogEntity;

public interface SysLogService {
    void save(SysLogEntity sysLog);
}
