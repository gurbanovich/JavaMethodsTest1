package var1;

import java.util.Scanner;

/**
 * Enter the password from the command line and compare it with the sample
 * string.
 **/

public class Q4 {

	public static void main(String[] args) {
		String pass = "616368";
		Scanner scan = new Scanner(System.in);
		System.out.println("Put the password");
		;
		String inPass = scan.next();
		System.out.println(inPass);
		;
		if (pass.equals(inPass))
			System.out.println("Password is true");
		else
			System.out.println("Password is false");
		scan.close();

	}

}
