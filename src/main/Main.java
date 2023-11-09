package main;

public class Main {

	public static void main(String[] args) {

	// Step 1. Setup Match 
		MatchConfig GameSetup = new MatchConfig();
		CoinToss Toss = new CoinToss();

		// Setup Team Names 
		String HomeTeam = GameSetup.homeTeam();
		System.out.println(HomeTeam);

		String AwayTeam = GameSetup.awayTeam();
		System.out.println(AwayTeam);

		// Select Match Format (No. of overs per side)
		String gameFormat = GameSetup.Format();
		System.out.println(gameFormat);

		// Coin Toss 
		String tossWinner = Toss.nameToss(HomeTeam, AwayTeam);
		System.out.println("Toss won by" + " " + tossWinner);

		// Toss winner choose to Bat or Bowl 
		String tossWinnerChoice = GameSetup.batOrBowl();
		System.out.println(tossWinner + " " + "won the Toss and decided to" + " " + tossWinnerChoice + " " + "first!");		
	
		
	// Step 2. Start Match
	}

}
