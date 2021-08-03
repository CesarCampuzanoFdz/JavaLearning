package com.cesar.project.learnspringframework.game.looseCoupled;

public class OtherGameLoose implements GamingConsole {

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
