package com.cesar.project.learnspringframework.game.looseCoupled;

public class MarioGameLoose implements GamingConsole {

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
