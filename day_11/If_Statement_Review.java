package day_11;
import java.util.Scanner;
public class If_Statement_Review {

	public static void main(String[] args) {
		
		int A = 10;
		/*
		if (A > 1) {
			System.out.println("A is > than " + A );
		}
		if (A < 1) {
			System.out.println("A is < than" + A);
		}
		
		if (A < 1) {
		System.out.println("A is < " + A);
		}else if (A == A) {
			System.out.println("A is = " + A);
		}else if (A > 1) {
			System.out.println("A is > " + A);
		}
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number 1-12");
		int num = scan.nextInt();
		
		String month  = "Invalid month";
		int days = 0;
		
		if (num == 1) {
			month = "January";
			days = 31;
		}else if (num == 2) {
			month = "February";
			days = 28;
		}else if (num == 3) {
			month = "March";
			days = 31;
		}else if (num == 4) {
			month = "April";
			days = 30;
		}else if (num == 5) {
			month = "May";
			days = 31;
		}else if (num == 6) {
			month = "June";
			days = 30;
		}else if (num == 7) {
			month = "July";
			days = 31;
		}else if (num == 8) {
			month = "August";
			days = 31;
		}else if (num == 9) {
			month = "September";
			days = 30;
		}else if (num == 10) {
			month = "October";
			days = 31;
		}else if (num == 11) {
			month = "November";
			days = 30;
		}else if (num == 12) {
			month = "December";
			days = 31;
			
		}else {
			month = "Invalid month";
		}
		System.out.println(month);
		System.out.println(num + " is "+ month);
		System.out.println(num + " is "+ month + " and "+month+" has "+ days+" days");
scan.close();
	}

}
