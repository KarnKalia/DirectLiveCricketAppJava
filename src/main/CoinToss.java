package main;
import java.util.Random;


public class CoinToss {
	
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
	

}

