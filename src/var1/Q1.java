package var1;
import java.util.Scanner;

/**
 *  The task: To welcome any user after  entering his name through
 *  the command line.  
 **/

public class Q1 {

	public static void main(String[] args) {
		
		System.out.println("введите ваше имя");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("привет " + name);
		scan.close();
	}

}
