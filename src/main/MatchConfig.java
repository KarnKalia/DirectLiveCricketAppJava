package main;
import java.util.Scanner;

public class MatchConfig {

// Set Team A
	public String TeamA() {
		
		String TeamA;
		Scanner TeamNames = new Scanner(System.in);
		
		System.out.println("Type Team A Name");
		TeamA = TeamNames.nextLine();
		
		TeamNames.close();
		
		return TeamA;
	}

// Set Team B	
public String TeamB() {
		
		String TeamB;
		Scanner TeamNames = new Scanner(System.in);
		
		System.out.println("Type Team B Name");
		TeamB = TeamNames.nextLine();
		
		TeamNames.close();
		return TeamB;
	}
	
// Match Heading on top of the Score-Panel
public String PrintMatchHeading() {
		
		return TeamA() + " " + "VS" + " " + TeamB();		
	}

}
