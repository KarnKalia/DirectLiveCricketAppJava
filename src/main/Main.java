package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Step 1. Setup Match 
		Scanner scan = new Scanner(System.in);
		MatchConfig GameSetup = new MatchConfig();
		CoinToss Toss = new CoinToss();
		Scoring teamRuns = new Scoring();
		NewInnings startInnings = new NewInnings();
		
		/***********************************************************************************************/
		
		int ScoreOne;

		/***********************************************************************************************/

		// Setup HomeTeam Name 
		System.out.println("Type Home Team Name");
		String homeTeam[] = GameSetup.teamSelection();
		System.out.println(Arrays.toString(homeTeam));
		
		System.out.println("Type Away Team Name");
		String awayTeam[] = GameSetup.teamSelection();
		System.out.println(Arrays.toString(awayTeam));

		// Select Match Format (No. of overs per side)
		int gameFormat = GameSetup.Format();
		System.out.println(gameFormat);

		// Coin Toss 
		String tossWinner = Toss.nameToss(homeTeam[0], awayTeam[0]);
		System.out.println("Toss won by" + " " + tossWinner);

		// Toss winner choose to Bat or Bowl 
		String tossWinnerChoice = GameSetup.batOrBowl();
		System.out.println(tossWinner + " " + "won the Toss and decided to" + " " + tossWinnerChoice + " " + "first!");

		// Step 2. Start Match
			
		String teamScoreDisplay = GameSetup.battingTeam(tossWinner, homeTeam[0], awayTeam[0], tossWinnerChoice);
		System.out.println("Team batting first:" + " " + teamScoreDisplay);
		
		ScoreOne = teamRuns.addScore(teamRuns.ScoreCounter);
		System.out.println(ScoreOne);
		System.out.println(teamScoreDisplay + ":" + " " + teamRuns.addScore(gameFormat) + "/" + "10(WKTS)");

		

	}



}
