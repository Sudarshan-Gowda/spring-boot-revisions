package com.star.sud.spring.game;

public class SuperContra implements GamingConsole{

    public void left() {
        System.out.println("SuperContra#Left running");
    }

    public void right() {
        System.out.println("SuperContra#Right running");
    }

    public void up() {
        System.out.println("SuperContra#Up running");
    }

    public void down() {
        System.out.print("SuperContra#Down running");
    }
}
