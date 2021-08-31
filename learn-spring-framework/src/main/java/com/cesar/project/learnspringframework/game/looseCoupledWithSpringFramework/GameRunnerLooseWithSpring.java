package com.cesar.project.learnspringframework.game.looseCoupledWithSpringFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//To let Spring handle the creation of this class, I put @Component before the class definition
@Component
public class GameRunnerLooseWithSpring {

    // Since I indicate that MarioGame was a component, I make Spring Autowire it to
    // here:
    @Autowired
    private GamingConsoleWithSpring game;

    public GameRunnerLooseWithSpring(GamingConsoleWithSpring game) {
	this.game = game;
    }

    public void runGame() {
	game.up();
	game.down();
	game.left();
	game.right();
    }

}
