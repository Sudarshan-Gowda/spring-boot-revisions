package com.star.sud.spring.game;

public class GameRunner {

    private final GamingConsole gamingConsole;

    public GameRunner(GamingConsole gamingConsole){
        this.gamingConsole = gamingConsole;
    }

    public void run(){
        System.out.println("Game Running");
        gamingConsole.left();
        gamingConsole.right();
        gamingConsole.up();
        gamingConsole.down();
    }

}
