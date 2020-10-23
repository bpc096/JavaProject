import Menu.HotelMenu;
import Menu.Menu;
//import Menu.StudentISMenu;

public class Main {

	public static void main(String[] args) {
		Displayer displayer = new Displayer(new HotelMenu());
		displayer.display();
	}

}
