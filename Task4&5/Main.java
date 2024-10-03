import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {

		ArrayList <String> actions = new ArrayList<>();
		actions.add("Start game");
		actions.add("Resume game");
		actions.add("Pause game");
		actions.add("End game");

		//System.out.print(actions.get(2));
		//displayMenu();

		GameMenu gameMenu = new GameMenu(actions);

		String choice = gameMenu.getAction();
		Integer.parseInt(choice);
		doAction(Integer.parseInt(choice));
	}

	public static void doAction(int action){
		switch (action){
		case 1:
			System.out.println("1: Starting the game now");
			break;
		case 2:
			System.out.println("2: Fetching previously saved game data");
			break;
		case 3:
			System.out.println("3: Game Paused");
			break;
		case 4:
			System.out.println("4: Ending game");
			break;
		}

	}
}