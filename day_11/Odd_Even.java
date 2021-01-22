package day_11;
import java.util.Scanner;
public class Odd_Even {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number \n");
		
		int A = scan.nextInt();
		
		if (A % 2 == 0) {
			System.out.println("Your number is even");
		}else
			System.out.println("Your number is odd");
		scan.close();
		
	}

}
