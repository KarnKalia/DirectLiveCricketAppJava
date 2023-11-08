package main;
import java.util.Random;


public class CoinToss {
	
// Manual Coin Toss	

	public String Toss() {

		String Heads = "Heads";
		String Tails = "Tails";

		Random r = new Random();

		int a = r.nextInt(2);

		if(a == 0) {
			return Heads;

		} else 
			return Tails;
	}
	
// Coin Toss Generated during Setup
	
	public String nameToss(String Heads, String Tails) {

		Random r = new Random();

		int a = r.nextInt(2);

		if(a == 0) {
			return Heads;

		} else 
			return Tails;
	}

}

