package com.congklak.ui;
import java.util.Scanner;

public class MainMenu {
	public Scanner scan = new Scanner(System.in);
	private Gameable gameMenu = null;
	private HowToPlayMenu howToPlayMenu = null;
	
	public MainMenu() {
		int input = -1;
		do {
			printLine();
			System.out.println("Menu\n" +
					"----\n" +
					"1. Player vs Player\n" +
					"2. Player vs Computer (Easy)\n" +
					"3. Player vs Computer (Medium)\n" +
					"4. Player vs Computer (Hard)\n" +
					"5. Player vs Computer (Expert)\n" +
					"6. How to Play\n" +
					"7. Exit");
			System.out.print("Choose: ");
			try {
				input = scan.nextInt();
				if(scan.hasNextLine()) {
					scan.nextLine();
				}
			} catch (Exception ex) {
				input = -1;
			}
			switch (input) {
				case 1: setGameMenu(new GameMenu(this)); break;
				case 2: setGameMenu(new GameMenu(this, GameMenu.EASY)); break;
				case 3: setGameMenu(new GameMenu(this, GameMenu.MEDIUM)); break;
				case 4: setGameMenu(new GameMenu(this, GameMenu.HARD)); break;
				case 5: setGameMenu(new GameMenu(this, GameMenu.EXPERT)); break;
				case 6: setHowToPlayMenu(new HowToPlayMenu(this)); break;
			}
		} while(input != 7);
	}
	
	public void printLine() {
		for (int i = 0; i < 30; i++) {
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new MainMenu();
	}

	public HowToPlayMenu getHowToPlayMenu() {
		return howToPlayMenu;
	}

	public void setHowToPlayMenu(HowToPlayMenu howToPlayMenu) {
		this.howToPlayMenu = howToPlayMenu;
	}

	public Gameable getGameMenu() {
		return gameMenu;
	}

	public void setGameMenu(Gameable gameMenu) {
		this.gameMenu = gameMenu;
	}
}
