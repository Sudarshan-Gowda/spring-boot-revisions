package com.star.sud.spring;

import com.star.sud.game.GameRunner;
import com.star.sud.game.MarioGame;
import com.star.sud.game.SuperContra;

public class AppGamingBasic {

    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var superContr = new SuperContra();
        var marioRunner = new GameRunner(marioGame);
        marioRunner.run();
        var superContraRunner = new GameRunner(superContr);
        superContraRunner.run();

    }
}
