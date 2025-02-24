package com.star.sud.game;

public class Main {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var superContr = new SuperContra();
        var marioRunner = new GameRunner(marioGame);
        marioRunner.run();
        var superContraRunner = new GameRunner(superContr);
        superContraRunner.run();
    }
}