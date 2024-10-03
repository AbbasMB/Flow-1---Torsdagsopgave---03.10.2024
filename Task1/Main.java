//Task 1

public class Main{

	public static void main(String[] args) {

		Team team1 = new Team("FC København");
		Team team2 = new Team("Brøndby IF");
		Team team3 = new Team("FC Midtjylland");
		Team team4 = new Team("FC Nordsjælland");
		Team team5 = new Team("Viborg FF");

		team1.addPlayer("Andreas Cornelius");
		team2.addPlayer("Kevin Mensah");
		team3.addPlayer("Christian Sørensen");
		team4.addPlayer("Peter Ankersen");
		team5.addPlayer("Isak Jensen");


		team1.setRank(1);
		team2.setRank(100);
		team3.setRank(99);
		team4.setRank(2);
		team5.setRank(3);

		System.out.println(team1.toString());

		System.out.println(team2.toString());
		System.out.println(team3.toString());
		System.out.println(team4.toString());
		System.out.println(team5.toString());
		
	}
}