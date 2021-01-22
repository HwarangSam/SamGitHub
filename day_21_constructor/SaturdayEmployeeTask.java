package day_21_constructor;

import java.util.ArrayList;
import java.util.Scanner;

public class SaturdayEmployeeTask {

	public static void main(String[] args) {
		//some number of employee with names
		//they visit different amount of countries 0,3,5
		//employee name and number of countries
		//ArrayList, two dimensional array size 5 string, int convert to string using wrapper class
		//Scanner get string from input, then get int
		
//		scan.next();
		
		String[][] arr = new String [5][];
		
		String[] employeeNames = new String[5];
		String[] numberOfCountries = new String[5];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < employeeNames.length; i++) {
				String result = scan.nextLine();
				employeeNames[i] = result;
		}
		for (int i = 0; i < numberOfCountries.length; i++) {
			String result = scan.nextLine();
			numberOfCountries[i] = result;
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i][1] = numberOfCountries[i];
			}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println();
			}
			System.out.println();
		}
		
		
		
	
		
		
	}
}
