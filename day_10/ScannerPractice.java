package day_10;
import java.util.Scanner;
public class ScannerPractice {

	public static void main(String[] args) {
	
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Enter first number");
		
		int A = num.nextInt(); //dataType variable = scannerName.next"dataType"();
		
		System.out.println("Enter second number");
		
		int B = num.nextInt();
		
		System.out.println("Enter third number");
	
		int C = num.nextInt();	
		
		if (A > B && A > C) {
			System.out.println(A + " is the largest number");
		}
		if (B > A && B > C) {
			System.out.println(B + " is the largest number");
			
		if (C > A && C > B)
			System.out.println(C + " is the largest number");
		}
		if (A == B && A == C || B == A && B == C) {
			System.out.println("All numbers are equal");
		}
		
		num.close();
		
		//output: which is the max or are they equal
		
		
		
		
		
		}

}
