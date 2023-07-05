package com.developerishan.learnspringframework;

import com.developerishan.learnspringframework.game.GameRunner;
import com.developerishan.learnspringframework.game.MarioGame;
import com.developerishan.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
				
	}

}
