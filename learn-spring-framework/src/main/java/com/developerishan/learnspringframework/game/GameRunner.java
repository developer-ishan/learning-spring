package com.developerishan.learnspringframework.game;

public class GameRunner {
	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running game: "+game);
		game.down();
		game.left();
		game.up();
		game.right();
	}
}
