package com.cesar.project.learnspringframework.game.looseCoupledWithSpringFramework;

import org.springframework.stereotype.Component;

//To let Spring handle the creation of this class, I put @Component before the class definition
@Component
public class OtherGameLooseWithSpring implements GamingConsoleWithSpring {

	@Override
	public void up() {
		System.out.println("Jump in the other game!");
	}

	@Override
	public void down() {
		System.out.println("Evade in the other game!");
	}

	@Override
	public void left() {
		System.out.println("Advance in the other game!");
	}

	@Override
	public void right() {
		System.out.println("Retreat in the other game!");
	}
}
