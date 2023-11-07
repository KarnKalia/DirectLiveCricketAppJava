package main;
import java.util.Scanner;

public class MatchConfig {
	
	public String TeamNames() {
		
		String TeamA;
		String TeamB;		
		
		Scanner TeamNames = new Scanner(System.in);
		
		System.out.println("Type Team A Name");
		TeamA = TeamNames.nextLine();
		
		System.out.println("Type Team B Name");
		TeamB = TeamNames.nextLine();
		
		TeamNames.close();
		
		return TeamA + " " + "VS" + " " + TeamB;		
	}

}
