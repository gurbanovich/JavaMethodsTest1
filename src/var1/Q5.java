package var1;

/**
 * Enter integers as command-line arguments, count their sums (products), and
 * output the result to the console.
 **/

public class Q5 {

	public static void main(String[] args) {
		int sum = 0, mult = 1;
		for (int i = 0; i <= args.length - 1; i++) {
			sum += Integer.parseInt(args[i]);
			mult *= Integer.parseInt(args[i]);
		}
		System.out.println("sum = " + sum);
		System.out.println("mult = " + mult);
	}

}
