package com.star.sud;

import com.star.sud.game.GameRunner;
import com.star.sud.game.MarioGame;
import com.star.sud.game.SuperContra;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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