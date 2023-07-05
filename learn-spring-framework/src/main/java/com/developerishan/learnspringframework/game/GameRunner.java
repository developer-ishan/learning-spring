package com.developerishan.learnspringframework.game;

public class GameRunner {
	private SuperContraGame game;
	
	public GameRunner(SuperContraGame game) {
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
