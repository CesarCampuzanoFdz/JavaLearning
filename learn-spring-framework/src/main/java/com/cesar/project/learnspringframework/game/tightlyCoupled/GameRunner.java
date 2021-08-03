package com.cesar.project.learnspringframework.game.tightlyCoupled;

public class GameRunner {
    private MarioGame game;

    public GameRunner(MarioGame game) {
	this.game = game;
    }

    public void runGame() {
	game.up();
	game.down();
	game.left();
	game.right();
    }

}
