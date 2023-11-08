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

	//Set Format Type
	public int Format() {
		System.out.println("Type match overs per side (Numbers Only)");
		int Over = MatchSettings.nextInt();

		return Over;
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

	//Match Heading on top of the Score-Panel
	public String Match() {

		return homeTeam() + " " + "VS" + " " + 
				awayTeam() +"\n"+ Format() + "\n" + 
				"Game Date(s)" + " " + MatchDate();	
	}

	// Code barrier 
}
