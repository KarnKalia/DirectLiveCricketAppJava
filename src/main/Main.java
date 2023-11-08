package main;

public class Main {

	public static void main(String[] args) {

		// Setup Match 
		MatchConfig GameSetup = new MatchConfig();
		CoinToss Toss = new CoinToss();

		// Setup Team Names 
		String nameTeamA = GameSetup.homeTeam();
		System.out.println(nameTeamA);

		String nameTeamB = GameSetup.awayTeam();
		System.out.println(nameTeamB);

		// Select Match Format (No. of overs per side)
		int gameFormat = GameSetup.Format();
		System.out.println(gameFormat);

		// Coin Toss 
		String tossWinner = Toss.nameToss(nameTeamA, nameTeamB);
		System.out.println("Toss won by" + " " + tossWinner);

		// Toss winner choose to Bat or Ball 
		String tossWinnerChoice = GameSetup.batOrBowl();
		System.out.println(tossWinner + " " + "won the Toss and decided to" + " " + tossWinnerChoice + " " + "first!");		
	}

}
