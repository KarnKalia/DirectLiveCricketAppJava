package main;
import java.util.Scanner;

public class MatchConfig {
	
	Scanner TeamNames = new Scanner(System.in);

 // Set Team A
	public String TeamA() {
		
		String TeamA;	
		System.out.println("Type Team A Name");
		
		TeamA = TeamNames.nextLine();	
		return TeamA;
	}

// Set Team B	
public String TeamB() {
		
		String TeamB;		
		System.out.println("Type Team B Name");
		
		TeamB = TeamNames.nextLine();
		return TeamB;
	}
	
	
// Match Heading on top of the Score-Panel
public String PrintMatchHeading() {
		
		return TeamA() + " " + "VS" + " " + TeamB();		
	}

}
