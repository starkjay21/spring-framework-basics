package com.jayeshxn.learnspringframework;

import com.jayeshxn.learnspringframework.game.GameRunner;
import com.jayeshxn.learnspringframework.game.Pacman;

public class App01GamingBasic {
    public static void main(String[] args) {

        var game = new Pacman(); //1: Object Creation

        var gameRunner = new GameRunner(game);
            //2: Object Creation +
            //   Wiring(Injecting) of Dependencies
            //   Game is a Dependency of GameRunner

        gameRunner.run();
    }
}
