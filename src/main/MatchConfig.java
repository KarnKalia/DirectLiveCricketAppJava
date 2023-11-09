package main;

import java.util.Scanner;

public class MatchConfig {

	Scanner MatchSettings = new Scanner(System.in);

	// Set Match date
	public String MatchDate() {
		System.out.println("Type Match date DD-MM-YYYY");
		String MatchDate = MatchSettings.next();

		return MatchDate;
	}
	// Set Team A
	public String homeTeam() {

		System.out.println("Type Home Team Name");

		String TeamA = MatchSettings.nextLine();
		return TeamA;
	}

	// Set Team B	
	public String awayTeam() {

		System.out.println("Type Away Team Name");
		String TeamB = MatchSettings.nextLine();
		return TeamB;
	}

	public String Format() {
		
		System.out.println("Type match overs per side (Numbers Only)");
		String Overs = MatchSettings.nextLine();
		
		while (stringCheck(Overs)) {
			System.out.println("Type match overs per side (Numbers Only)");
			Overs = MatchSettings.nextLine();	
		}
		return Overs;
	}
	
	
// Check each character if its a number 		
	public boolean stringCheck(String input) {
		
		boolean hasString = false;
		int index = 0;
		
		while (index < input.length()) {
			if (!(input.charAt(index) >= '0' && input.charAt(index) <= '9')) {
				hasString = true;
			}
			index++;
		} return hasString;
	}
		
//
//	  public int gameSetOvers() {
//		  int Overs = Format();
//		  
//		  if ((Overs > 0)&& (Overs <= 100)) {
//			  
//			  return Overs;
//		
//		  } return Format();
//		  
//	  }


	// Select Bat or Bowl 

	public String batOrBowl() {

		System.out.println("Type \'1' or \'2':" + "\n 1: Bat" + "\n 2: Bowl");

		String Bat = "Bat";
		String Bowl = "Bowl";

		int choose = MatchSettings.nextInt();
		System.out.println(choose);

		if (choose == 1) {
			return Bat;
		}else if (choose == 2) {
			return Bowl;
		}return batOrBowl();

	}

	//Match Heading on top of the Score-Panel
	public String Match() {

		return homeTeam() + " " + "VS" + " " + 
				awayTeam() +"\n"+ Format() + "\n" + 
				"Game Date(s)" + " " + MatchDate();	
	}

	// Code barrier 
}
