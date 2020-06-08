package com.javaboy.demo.entity;

import lombok.Data;

@Data
public class SysLogEntity {
    private String className;

    private String methodName;

    private String params;

    private Long exeuTime;

    private String remark;

    private String createDate;


}
