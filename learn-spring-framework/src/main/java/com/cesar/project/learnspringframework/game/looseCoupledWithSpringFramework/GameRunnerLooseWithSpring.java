package com.cesar.project.learnspringframework.game.looseCoupledWithSpringFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//To let Spring handle the creation of this class, I put @Component before the class definition
@Component
public class GameRunnerLooseWithSpring {

	// Since I indicate that MarioGame was a component, I make Spring Autowire it to
	// here (via Constructor injection, that allows Spring to create the class with
	// the constructor that have all the dependencies)
	@Autowired
	private GamingConsoleWithSpring game;

	public GameRunnerLooseWithSpring(GamingConsoleWithSpring game) {
		this.game = game;
	}

	/*
	 * //It can be Injected (Autowired) the class via a setter, but it is
	 * recommended to //use a CONSTRUCTOR based injection (done in the lines above)
	 * 
	 * @Autowired public void setGame(GamingConsoleWithSpring game) { this.game =
	 * game; }
	 */

	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
