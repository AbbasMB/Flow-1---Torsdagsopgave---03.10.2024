import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu{

	private ArrayList<String> actions;

	public GameMenu(ArrayList<String> actions){
		this.actions = actions;
	}

	public void displayMenu(){
		int i = 1;
		for(String s : actions){
			System.out.println(i + ") " + s);
			i++;
		}
	}

	public String getAction(){
		System.out.println("Type a number to choose an action");
		displayMenu();
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		return choice;
	}
}