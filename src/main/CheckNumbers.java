package main;


public class CheckNumbers {
	
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

}
