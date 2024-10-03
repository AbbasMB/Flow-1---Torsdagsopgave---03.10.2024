import java.util.ArrayList;

public class Team{

	private String teamName;
	private ArrayList<String> playerName;
	private int rank;

	public Team(String teamName){
		this.teamName = teamName;
		this.playerName = new ArrayList<>();
	}

	public void setRank(int rank){
		this.rank = rank;
	}

    public String toString() {
        String result = "Hold: " + teamName + ", Rang: " + rank + "\nSpiller: \n";


        for (String player : playerName) {
            result += player + "\n";
        }

        return result;
    }

	public void addPlayer(String playerName){
		this.playerName.add(playerName);
	}
	
}