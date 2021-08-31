package com.cesar.project.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cesar.project.learnspringframework.game.looseCoupled.GameRunnerLoose;
import com.cesar.project.learnspringframework.game.looseCoupled.MarioGameLoose;
import com.cesar.project.learnspringframework.game.looseCoupled.OtherGameLoose;
import com.cesar.project.learnspringframework.game.looseCoupledWithSpringFramework.GameRunnerLooseWithSpring;
import com.cesar.project.learnspringframework.game.tightlyCoupled.GameRunner;
import com.cesar.project.learnspringframework.game.tightlyCoupled.MarioGame;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

		System.out.println("-------Tightly Coupled-------");
		// I will create a game:
		MarioGame game1 = new MarioGame();
		// To be run in a console with a game Runner
		GameRunner runner1 = new GameRunner(game1);

		// Now, as this is done with a tight coupling, I cannot easily change the game,
		// since the GameRunner expects the MarioGame in the constructor.
		runner1.runGame();

//Now I will take the loose aproach, using interfaces:	

		System.out.println("-------Loose Coupled-------");
		// I will create a game:
		MarioGameLoose game2 = new MarioGameLoose();
		GameRunnerLoose runner2 = new GameRunnerLoose(game2);
		runner2.runGame();

		// And now using the same code can be used to run the other game:
		OtherGameLoose game3 = new OtherGameLoose();
		GameRunnerLoose runner3 = new GameRunnerLoose(game3);
		runner3.runGame();

//I take another approach, using SPRING FRAMEWORK:

		System.out.println("-------Loose Coupled with Spring-------");
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		GameRunnerLooseWithSpring runner4 = context.getBean(GameRunnerLooseWithSpring.class);
		runner4.runGame();
	}

}
