package day_21_constructor;

import java.util.ArrayList;
import java.util.Scanner;

public class SaturdayEmailTask {

	public static void main(String[] args) {
		// Use Scaner email as a string String
				//1. if email has 3 letters return first letter and rest 2 letters substitute with a * sign
				//2. if email has only  one leeter return one letter
				//3. more then 3 leter return first 3 letter and rest letter substitute with a * sign
		
//		ArrayList <String> emails = new ArrayList<>();

		
		Scanner scan = new Scanner(System.in);
		String email = scan.nextLine();
		String result = "";
		
		String[] splitEmail = email.split("@");
		
		if (splitEmail[0].length()-1 == 1) {
			result = email;
		}else if(splitEmail[0].length()==3) {
			result = splitEmail[0] + "**" + splitEmail[1];
		}else if (splitEmail[0].length()>3) {
			String star = "";
			int count = splitEmail[0].length()-3;
			for (int i = 0; i < count; i++) {
				star += "*";
			}
			result = email.substring(0,3)+star+splitEmail[1];
		}
		System.out.println(result);
		System.out.println(email);
		
	}

}
