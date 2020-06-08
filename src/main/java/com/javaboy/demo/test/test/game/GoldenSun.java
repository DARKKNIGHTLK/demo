package com.javaboy.demo.test.test.game;


import com.javaboy.demo.annotation.DateFormat;

import java.math.BigDecimal;
import java.util.Date;

public class GoldenSun implements Game {

    private BigDecimal price;

    private String gameName;

    private int sales;

    private Date createDate;

    private String describe;

    public GoldenSun() {
        this.price = new BigDecimal(385.5);
        this.gameName = "GoldenSun";
        this.sales = 530000;
        this.createDate = new Date();
        this.describe = "黄金太阳（日文：黄金の太阳，英文：Golden Sun）是由Camelot Software Planning出品，任天堂发行的奇幻角色扮演游戏系列，第一作发布于2001年。游戏以炼金术为题材，讲述了年轻元素使拯救世界的故事。目前系列一共发布了三作，分别是Game Boy Advance上的《黄金太阳 开启的封印》、《黄金太阳 失落的时代》和任天堂DS平台上的《黄金太阳 漆黑的黎明》。系列曾经被称为“最好的掌机游戏”，三作在全球总销量超过350万套";
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }

    @Override
    public String getGameName() {
        return this.gameName;
    }

    @Override
    public int getSales() {
        return this.sales;
    }

    @Override
    @DateFormat
    public Date getCreateDate() {
        return this.createDate;
    }

    @Override
    public String getDescribe() {
        return this.describe;
    }

    @Override
    public String toString() {
        return "GoldenSun{" +
                "price=" + price +
                ", gameName='" + gameName + '\'' +
                ", sales=" + sales +
                ", createDate=" + createDate +
                ", describe='" + describe + '\'' +
                '}';
    }
}
