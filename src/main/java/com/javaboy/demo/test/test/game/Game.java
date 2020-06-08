package com.javaboy.demo.test.test.game;

import java.math.BigDecimal;
import java.util.Date;

public interface Game {

    BigDecimal getPrice();

    String getGameName();

    int getSales();

    Date getCreateDate();

    String getDescribe();
}
