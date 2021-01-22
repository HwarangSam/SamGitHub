package day_18;

import java.util.Random;

public class Method_Review {

	public static void main(String[] args) {
		
//		System.out.println(reverseString("Hello"));	//olleH
//		System.out.println(reverseString("12345")); //54321	
//		System.out.println(randomPhone("301"));
	
		for (int i = 0; i < 10; i++) {
			System.out.println(randomPhone("240"));  //still kinda janky	
			
		}
	}
	
	
	public static String reverseString(String str) {
		
		StringBuilder sb = new StringBuilder();		//string builder has built in reverse function
		sb.append(str);
		sb.reverse();								//and there it is
//		System.out.println(sb.toString());			//if we were to print it out now
		return sb.toString();						//function to put it to string
	}
	
	public static String randomPhone(String areaCode) {
		StringBuilder sb = new StringBuilder();
		Random rd = new Random();
		
		sb.append("("+areaCode+")");
		sb.append(rd.nextInt(999));		//with random the () is the number limit
		sb.append("-"+rd.nextInt(9999));
		
		return sb.toString();
	
	}
}
