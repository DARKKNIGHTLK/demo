package com.javaboy.demo.test.test.factory;

import com.javaboy.demo.test.test.game.Game;
import com.javaboy.demo.utils.PropertiesUtil;

/**
 * 具体工厂
 */
public class NintendoFactory implements GameCompanyFactory {

    @Override
    public Game createGame(String gameName) throws Exception {
        Class<?> clazz = Class.forName(PropertiesUtil.getProperty(gameName));
        return (Game) clazz.newInstance();
    }

}
