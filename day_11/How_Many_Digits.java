package day_11;
import java.util.Scanner;
public class How_Many_Digits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number from 1-100000");
		
		long num = scan.nextLong();
		
		if (num <= 9) {
			System.out.println(num + " has 1 digit");
		}else if (num >=10 && num <= 99) {
			System.out.println(num + " has 2 digits");
		}else if (num >= 100 && num <= 999) {
			System.out.println(num + " has 3 digits");
		}else if (num >= 1000 && num <= 9999) {
			System.out.println(num + " has 4 digits");
		}else if (num >= 10000 && num <= 99999) {
			System.out.println(num + " has 5 digits");
		}else if (num == 100000) {
			System.out.println(num + " has 6 digits");
		}else
			System.out.println("Your number is too high");
	
	scan.close();
	
	}

}
