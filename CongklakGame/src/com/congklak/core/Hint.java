package com.congklak.core;

public class Hint extends Computer {

	public Hint(String name) {
		super(name);
	}
	
	public int getHint(Player p1, Player p2) {
		GameState state = new GameState(p1.clone(), p2.clone());
		this.combination(state);
		return this.solutions.get(0).picks.get(0);
	}
}
