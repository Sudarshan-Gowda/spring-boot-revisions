package com.star.sud.spring.game;

public class Cricket implements  GamingConsole{
    public void left() {
        System.out.println("Cricket#Left running");
    }

    public void right() {
        System.out.println("Cricket#Right running");
    }

    public void up() {
        System.out.println("Cricket#Up running");
    }

    public void down() {
        System.out.println("Cricket#Down running");
    }
}
