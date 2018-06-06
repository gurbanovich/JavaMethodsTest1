package var1;

import java.util.Random;

/**
 * Output a given number of random numbers with a transition and without a
 * transition on a new line. *
 **/

public class Q3 {

	public static void main(String[] args) {
		Random ron = new Random();
		for (int i = 0; i <= 12; i++) {
			System.out.println(ron.nextInt());
		}
		for (int i = 0; i <= 12; i++) {
			System.out.print(ron.nextInt() + " ");
		}
	}

}
