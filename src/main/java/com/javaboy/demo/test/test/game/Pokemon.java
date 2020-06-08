package com.javaboy.demo.test.test.game;

import java.math.BigDecimal;
import java.util.Date;

public class Pokemon implements Game {

    private BigDecimal price;

    private String gameName;

    private int sales;

    private Date createDate;

    private String describe;

    public Pokemon() {
        this.createDate = new Date();
        this.describe = "《宝可梦火红·叶绿》是1996年发行的《宝可梦红·绿》（口袋妖怪红·绿）的增强重制版，是一款由Game Freak开发，任天堂发售的Game Boy Advance游戏，能够使用与游戏绑定的GBA无线适配器。火红叶绿版最初在日本于2004年1月29日发售，后在北美及欧洲分别于9月和10月发售。";
        this.price = new BigDecimal("4800");
        this.sales = 100000;
        this.gameName = "宝可梦火红";
    }

    @Override
    public BigDecimal getPrice() {
        return null;
    }

    @Override
    public String getGameName() {
        return null;
    }

    @Override
    public int getSales() {
        return 0;
    }

    @Override
    public Date getCreateDate() {
        return null;
    }

    @Override
    public String getDescribe() {
        return null;
    }

    @Override
    public String toString() {
        return "Pokemmo{" +
                "price=" + price +
                ", gameName='" + gameName + '\'' +
                ", sales=" + sales +
                ", createDate=" + createDate +
                ", describe='" + describe + '\'' +
                '}';
    }
}
