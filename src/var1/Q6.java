package var1;

import java.util.Date;
import java.util.Scanner;

/**
 * Output the developer's name, date and time of the assignment, and date and
 * time of the assignment.
 **/

public class Q6 {

	public static void main(String[] args) {
		String name;
		String startDate;
		Date finishDate = new Date();
		Scanner scan = new Scanner(System.in);
		System.out.println("Puts your surname");
		name = scan.next();
		System.out.println("Puts your start date");
		startDate = scan.next();

		System.out.println("Programmer surname: " + name);
		System.out.println("start: " + startDate);
		System.out.println("finish: " + finishDate.toString());
		scan.close();

	}

}
