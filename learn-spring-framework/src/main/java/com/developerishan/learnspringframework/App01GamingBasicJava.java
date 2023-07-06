package com.developerishan.learnspringframework;

import com.developerishan.learnspringframework.game.GameRunner;
import com.developerishan.learnspringframework.game.MarioGame;
import com.developerishan.learnspringframework.game.PacmanGame;
import com.developerishan.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var pacmanGame = new PacmanGame(); //1: Object Creation
		var gameRunner = new GameRunner(pacmanGame);
		//2: Object Creation + wiring of dependencies
		// i.e. game runner needs an object of Game to run
		// Game is the dependency of GameRunner
		gameRunner.run();
				
	}

}
