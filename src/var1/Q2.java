package var1;

/**
 * The task: display the command line arguments 
 * in reverse in the console window.
 */

public class Q2 {

	public static void main(String[] args) {
		for (int i = args.length - 1; i >= 0; i--) {
			System.out.println("Arg " + args[i]);
		}
	}
}
