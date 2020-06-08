package com.javaboy.demo.service.serviceImpl;

import com.javaboy.demo.dao.SysLogDao;
import com.javaboy.demo.entity.SysLogEntity;
import com.javaboy.demo.service.SysLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service("sysLogService")
public class SysLogServiceImpl implements SysLogService {
    @Resource
    private SysLogDao sysLogDao;

    @Override
    public void save(SysLogEntity sysLog) {
        log.info("877979");
//        sysLogDao.save(sysLog);
    }
}
