package day_12_switch_statements;
import java.util.Scanner;
public class Ship {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many passengers are there?");
		
		int A = scan.nextInt();

		switch (A) {
		case 50:
			System.out.println("20 crew, 30 passengers");
			break;
		case 75:
			System.out.println("25 crew, 50 passengers");
			break;
		case 100:
			System.out.println("30 crew, 70 passengers");
			break;
			default:
			System.out.println("Invalid Number");
			break;
			} 
		
		scan.close();
	}

}
