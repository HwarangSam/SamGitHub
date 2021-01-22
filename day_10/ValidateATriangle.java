package day_10;
import java.util.Scanner;
public class ValidateATriangle {

	public static void main(String[] args) {
		//A triangle is valid if the sum of all 3 angles = 180 degrees. Check if a triangle is valid or not

		Scanner scan = new Scanner (System.in); //now prompt user
		
		System.out.println("Validate a Triangle");
		System.out.println("Enter Angle 1");
		
	int a = scan.nextInt(); //since primitive data type
	
	System.out.println("Enter Angle 2");
	int b = scan.nextInt();
	
	System.out.println("Enter Angle 3");
	int c = scan.nextInt();
	
	int sum = a+b+c;
	
	
	if (sum == 180 && a!=0 && b!=0 && c!=0)
		System.out.println("Valid Triangle");
	else 
			System.out.println("Not Valid Triangle");
	
	
	scan.close();
	
	
	}

}
