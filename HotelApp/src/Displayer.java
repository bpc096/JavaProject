import Menu.Menu;

public class Displayer {
	
	private Menu menu;
	
	public Displayer(Menu menu) {
		this.menu = menu;
	}
	
	public void display() {
		menu.display();
	}
}
