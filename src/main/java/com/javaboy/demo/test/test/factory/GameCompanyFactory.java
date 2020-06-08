package com.javaboy.demo.test.test.factory;

import com.javaboy.demo.test.test.game.Game;

/**
 * 抽象工厂
 */
@FunctionalInterface
public interface GameCompanyFactory {

    Game createGame(String gameName) throws Exception;
}
