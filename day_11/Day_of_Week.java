package day_11;
import java.util.Scanner;
public class Day_of_Week {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int day = scan.nextInt();
		
		if (day == 1) {
			System.out.println(day + " is Monday");
		}else if (day == 2) {
			System.out.println(day + " is Tuesday");
		}else if (day == 3) {
			System.out.println(day + " is Wednesday");
		}else if (day == 4) {
			System.out.println(day + " is Thursday");
		}else if (day == 5) {
			System.out.println(day + " is Friday");
		}else if (day == 6) {
			System.out.println(day + " is Saturday");
		}else if (day == 7) {
			System.out.println(day + " is Sunday");
		}else
			System.out.println("Invalid Number");
			
scan.close();
	}

}
