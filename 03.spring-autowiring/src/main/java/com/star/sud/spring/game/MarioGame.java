package com.star.sud.spring.game;

public class MarioGame implements GamingConsole {

    public void left() {
        System.out.println("MarioGame#Left running");
    }

    public void right() {
        System.out.println("MarioGame#Right running");
    }

    public void up() {
        System.out.println("MarioGame#Up running");
    }

    public void down() {
        System.out.println("MarioGame#Down running");
    }
}
