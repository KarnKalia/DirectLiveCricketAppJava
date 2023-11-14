package main;
import java.util.Scanner;

public class NewInnings {
	Scanner startInnings = new Scanner(System.in);
	CheckNumbers numCheck = new CheckNumbers();

	public String striker(String[] i) {
		System.out.println("select striker, select using player number in Team list");
		String a = startInnings.nextLine();	

		while (numCheck.stringCheck(a)) {
			System.out.println("Error: Enter Numbers Only");
			a = startInnings.nextLine();
		}
		return i[Integer.parseInt(a)-1];
	}

	public String nonStriker(String[] i) {
		System.out.println("select striker, select using player number in Team list");
		String a = startInnings.nextLine();	

		while (numCheck.stringCheck(a)) {
			System.out.println("Error: Enter Numbers Only");
			a = startInnings.nextLine();
		}
		return i[Integer.parseInt(a)-1];

	}	

}
