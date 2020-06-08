package com.javaboy.demo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @website https://www.zhyd.me
 * @version 1.0
 * @date 2018/4/16 16:26
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseCondition {
    public final static int DEFAULT_PAGE_SIZE = 10;
    private int pageNumber = 1;
    private int pageSize = 0;
    private int pageStart = 0;

    public int getPageSize() {
        return pageSize > 0 ? pageSize : DEFAULT_PAGE_SIZE;
    }

    public int getPageStart() {
        return pageNumber > 0 ? (pageNumber - 1) * getPageSize() : 0;
    }

}
