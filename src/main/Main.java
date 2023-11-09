package main;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// Step 1. Setup Match 
		MatchConfig GameSetup = new MatchConfig();
		CoinToss Toss = new CoinToss();

		// Setup HomeTeam Name 
		String HomeTeam = GameSetup.homeTeam();
		System.out.println(HomeTeam);

		// Add Players to HomeTeam

		String[] HomeTeamPlayerList = GameSetup.playerNames();
		System.out.println( HomeTeam + " " + "Team List Is:" + " " + Arrays.toString(HomeTeamPlayerList));
		
		// Setup AwayTeam Name 
		
		String AwayTeam = GameSetup.awayTeam();
		//System.out.println(AwayTeam);

		// Add Players to AwayTeam
		String[] AwayTeamPlayerList = GameSetup.playerNames();
		System.out.println(AwayTeam + " " + "Team List Is:" + " " + Arrays.toString(AwayTeamPlayerList));

		// Select Match Format (No. of overs per side)
		String gameFormat = GameSetup.Format();
		//System.out.println(gameFormat);

		// Coin Toss 
		String tossWinner = Toss.nameToss(HomeTeam, AwayTeam);
		System.out.println("Toss won by" + " " + tossWinner);

		// Toss winner choose to Bat or Bowl 
		String tossWinnerChoice = GameSetup.batOrBowl();
		System.out.println(tossWinner + " " + "won the Toss and decided to" + " " + tossWinnerChoice + " " + "first!");


		// Step 2. Start Match
	}



}
