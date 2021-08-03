package com.cesar.project.learnspringframework.game.looseCoupled;

public class GameRunnerLoose {
    // Now instead of MarioGame, I use the interface GamingConsole, so anything that
    // implements it, can be run
    private GamingConsole game;

    public GameRunnerLoose(GamingConsole game) {
	this.game = game;
    }

    public void runGame() {
	game.up();
	game.down();
	game.left();
	game.right();
    }

}
