package main;
import java.util.Scanner;

public class Scoring {

	Scanner scoring = new Scanner (System.in);

	int ScoreCounter = 0;

	public int one() {
		return 1;
	}

	public int two() {
		return 2;
	}

	public int three() {
		return 3;
	}

	public int four() {
		return 4;
	}

	public int six() {
		return 6;
	}

	public int bye(int a) {
		return a;
	}

	public int legBye(int a) {
		return a;
	}

	public int wide(int a) {
		return a + 1;
	}

	public int noBall(int a) {
		return a + 1;
	}

	public int penalty(int a) {
		return -a;
	}

	public int addScore(int a) {

		System.out.println("\n Choose Score:" + " " + "Single = 1 Double = 2 Three = 3 Four = 4 Six = 6" + "\n" +
				"\n Extras: bye = 7 Legbye = 8 Wide = 0 No Ball = 9 Penalty = 5");
		int score = scoring.nextInt();
		int extras;

		if(score == 1) {
			a = a + one();	
		} else if (score == 2) {
			a = a + two();
		} else if (score == 3) {
			a = a + three();
		} else if (score == 4) {
			a = a + four();
		} else if (score == 6) {
			a = a + six();
		} else if (score == 5) {
			System.out.println("Type Penalty runs");
			extras = scoring.nextInt();
			a = a + penalty(extras);

		}else if (score == 7) {
			System.out.println("Type Leg Bye runs");
			extras = scoring.nextInt();
			a = a + legBye(extras);

		}else if (score == 8) {
			System.out.println("Type Bye runs");
			extras = scoring.nextInt();
			a = a + bye(extras);

		}else if (score == 0) {
			System.out.println("Type extra runs with Wide");
			extras = scoring.nextInt();
			a = a + wide(extras);

		}else if (score == 9) {
			System.out.println("Type extra runs with no Ball");
			extras = scoring.nextInt();
			a = a + noBall(extras);

		}else if ((score > 9) || (score < 0)) {
			System.out.println("Choose between options 0 to 9 ");
			return addScore(a);
		} return a;
	}

}
