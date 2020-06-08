package com.javaboy.demo.service;

public interface PersonService {
    /**
     * 保存
     * @param name 名称
     */
    public void save(String name);
    /**
     * 根据ID更新名称
     * @param name 姓名
     * @param personId 人员ID
     */
    public void update(String name, Integer personId);
    /**
     * 根据ID获取名称
     * @param personId 人员ID
     * @return 名称
     */
    public String getPersonName(Integer personId);
}
