package main;

public class Main {

	public static void main(String[] args) {

	// Setup Match 
		MatchConfig Game = new MatchConfig();
		CoinToss Toss = new CoinToss();
		
	// 1.  Setup Team Names 
		String nameTeamA = Game.TeamA();
		System.out.println(nameTeamA);
		
		String nameTeamB = Game.TeamB();
		System.out.println(nameTeamB);
		
	// Select Match Format (No. of overs per side)
		int gameFormat = Game.Format();
		System.out.println(gameFormat);
		
	// Coin Toss 
		String tossWinner = Toss.nameToss(nameTeamA, nameTeamB);
		System.out.println("Toss won by" + " " + tossWinner);
		
	}

}
