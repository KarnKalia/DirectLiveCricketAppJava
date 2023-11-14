package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class MatchConfig {
	CheckNumbers numCheck = new CheckNumbers();
	Scanner MatchSettings = new Scanner(System.in);

	// Set Match date
	public String MatchDate() {
		System.out.println("Type Match date DD-MM-YYYY");
		String MatchDate = MatchSettings.next();

		return MatchDate;
	}
	// Set Team A
	public String[] teamSelection() {

		System.out.println("Type Home Team Name");

		String TeamA[] = new String[3];

		TeamA[0] = MatchSettings.nextLine();

		for(int i = 1; i < TeamA.length; i++) {
			System.out.println("Type Player" + " " + i + " " + "Name");
			TeamA[i] = MatchSettings.nextLine();
		}
		return TeamA;
	}

	//	public String Format() {
	//
	//		System.out.println("Type match overs per side (Numbers Only)");
	//		String Overs = MatchSettings.nextLine();
	//
	//		while (numCheck.stringCheck(Overs)) {
	//			System.out.println("Error: Enter Numbers Only");
	//			Overs = MatchSettings.nextLine();	
	//		}
	//		return Overs;
	//	}

	// need this code test for later, fix exceptions 
	public int Format() {

		System.out.println("Select Overs between ( 0 & 100)");
		int overs = MatchSettings.nextInt();		
		if ((overs > 0 ) && (overs <= 100)) {
			return overs;
		}return Format();
	}

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

	public String battingTeam(String t, String h, String a, String c) {

		if ((t == h) && (c == "Bat")) {
			return h;
		} return a;

	}

	//	//Match Heading on top of the Score-Panel
	//	public String Match() {
	//
	//		return homeTeam() + " " + "VS" + " " + 
	//				awayTeam() +"\n"+ Format() + "\n" + 
	//				"Game Date(s)" + " " + MatchDate();	
	//	}

	// Code barrier 
}
