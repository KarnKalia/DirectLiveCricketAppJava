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
	public String TeamA() {
			
		System.out.println("Type Team A Name");
		
		String TeamA = MatchSettings.nextLine();
		return TeamA;
	}

// Set Team B	
public String TeamB() {
				
		System.out.println("Type Team B Name");
		String TeamB = MatchSettings.nextLine();
		return TeamB;
	}
	
//Set Format Type
public String Format() {
	System.out.println("Type match overs per side (Numbers Only)");
	int Over = MatchSettings.nextInt();
	
	return Over + " " + "Over Match";
}

//Match Heading on top of the Score-Panel
public String Match() {
			
		return TeamA() + " " + "VS" + " " + TeamB() +"\n"+ Format() + "\n" + "Game Date(s)" + " " + MatchDate();		
	}

// Code barrier 
}
