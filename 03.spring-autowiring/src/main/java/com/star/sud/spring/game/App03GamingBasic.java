package com.star.sud.spring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasic {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        var game = context.getBean(GamingConsole.class);
        game.up();

        var bean = (MarioGame) context.getBean("game");
        bean.up();

        var latestGame = context.getBean(GamingConsole.class);
        latestGame.left();

        var latestGame1 = (GameRunner) context.getBean("latestGame");
        latestGame1.run();

        var latestGame2 = (GameRunner) context.getBean("latestGame2");
        latestGame2.run();
    }
}
