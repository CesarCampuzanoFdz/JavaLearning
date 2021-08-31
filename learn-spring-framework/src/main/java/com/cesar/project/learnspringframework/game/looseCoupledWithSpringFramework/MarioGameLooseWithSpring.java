package com.cesar.project.learnspringframework.game.looseCoupledWithSpringFramework;

import org.springframework.stereotype.Component;

//To let Spring handle the creation of this class, I put @Component before the class definition
@Component
public class MarioGameLooseWithSpring implements GamingConsoleWithSpring {

    @Override
    public void up() {
	System.out.println("Jump!");
    }

    @Override
    public void down() {
	System.out.println("Evade!");
    }

    @Override
    public void left() {
	System.out.println("Advance!");
    }

    @Override
    public void right() {
	System.out.println("Retreat!");
    }
}
