package com.congklak.ui;

import com.congklak.core.Computer;
import com.congklak.core.Hint;
import com.congklak.core.Player;

public class PlayerMenu {
	private Player player;
	private Player playerEasy;
	private Player playerMedium;
	private Player playerHard;
	private Player playerExpert;
	public final String label;
	private MainMenu mainMenu = null;
	
	public PlayerMenu(MainMenu mainMenu, String label) {
		this.mainMenu = mainMenu;
		this.label = label;
		this.player = null;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void createPlayer() {
		String name = "";
		do {
			System.out.print(label + " name: ");
			name = mainMenu.scan.nextLine();
		} while(name.length() == 0 || name.length() > 10);
		player = new Player(name);
	}
	
	public void createComputer(int level) {
		String name = Computer.generateName();
		switch (level) {
			case GameMenu.EASY:
				playerEasy = new Computer(name);
				break;
			case GameMenu.MEDIUM:
				playerMedium = new Computer(name);;
				break;
			case GameMenu.HARD:
				playerHard= new Computer(name);;
				break;
			case GameMenu.EXPERT:
				playerExpert = new Computer(name);;
				break;
		}
	}
	
	public int inputHole() {
		int hole = 0;
		do {
			System.out.println(player.getName() + " turn");
			if (player.getName().equals("BINUS")) { // hidden feature
				Hint c = new Hint("");
				System.out.println("Hint: " + c.getHint(player.getOpponent(), player));
			}
			System.out.print("Choose hole(1-7): ");
			if (mainMenu.scan.hasNextInt()) {
				hole = mainMenu.scan.nextInt();
			}
			if (mainMenu.scan.hasNextLine()) {
				mainMenu.scan.nextLine();
			}
		} while(hole < 1 || hole > 7 || player.getValueHole(hole - 1) == 0);
		return hole;
	}
	
	public void printDraw() {
		System.out.println("Draw");
		System.out.print("Press enter to continue");
		mainMenu.scan.nextLine();
	}
	
	public void printWin() {
		System.out.println(player.getName() + " win");
		System.out.print("Press enter to continue");
		mainMenu.scan.nextLine();
	};

//	public Player getPlayerEasy() {
//		return playerEasy;
//	}
//
//	public void setPlayerEasy(Player playerEasy) {
//		this.playerEasy = playerEasy;
//	}
//
//	public Player getPlayerMedium() {
//		return playerMedium;
//	}
//
//	public void setPlayerMedium(Player playerMedium) {
//		this.playerMedium = playerMedium;
//	}
//
//	public Player getPlayerExpert() {
//		return playerExpert;
//	}
//
//	public void setPlayerExpert(Player playerExpert) {
//		this.playerExpert = playerExpert;
//	}
//
//	public Player getPlayerHard() {
//		return playerHard;
//	}
//
//	public void setPlayerHard(Player playerHard) {
//		this.playerHard = playerHard;
//	}
}
