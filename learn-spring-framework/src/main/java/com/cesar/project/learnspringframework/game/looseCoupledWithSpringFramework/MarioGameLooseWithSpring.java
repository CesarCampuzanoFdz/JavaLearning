package com.cesar.project.learnspringframework.game.looseCoupledWithSpringFramework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//To let Spring handle the creation of this class,
//I put @Component before the class definition
//If there are multiple possible @components to autowire, I need a @Primary to let Spring
//now that this is the one that should be used
@Component
@Primary
public class MarioGameLooseWithSpring implements GamingConsoleWithSpring {

	@Override
	public void up() {
		System.out.println("Jump Mario!");
	}

	@Override
	public void down() {
		System.out.println("Evade Mario!");
	}

	@Override
	public void left() {
		System.out.println("Advance Mario!");
	}

	@Override
	public void right() {
		System.out.println("Retreat Mario!");
	}
}
