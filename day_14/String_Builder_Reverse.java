package day_14;

import java.util.Scanner;

public class String_Builder_Reverse {

	public static void main(String[] args) {
//Write a program that asks the user to input an integer and then outputs the number with the digits reversed.
		
//		StringBuilder sb = new StringBuilder();
//		sb.append("abc");
//		sb.append(123);
//		sb.append(true);
//		sb.append(4.25);
//		sb.append('A');
//		
//		System.out.println(sb.toString());
//		
//		String sbRev = sb.reverse().toString();
//		System.out.println(sbRev);

	
		
		
		
		//SECOND METHOD
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter you number");
//		
//		int num = scan.nextInt();
//		String revStr = "";
//		
//		String str = Integer.toString(num);		//Convert integer to string
//		System.out.println(str.length()); 		//5
//		
//		for(int i = str.length()-1; i>=0; i--) {  //we do -1 bc index number starts at 0 but length counts from 1
//			System.out.print(str.charAt(i));
//			revStr += str.charAt(i);	//wait what
//		}
//		System.out.println("\n");
//		System.out.println("revStr = " + revStr); //not super sure
//		
//		Integer.parseInt(revStr);
//		
//		scan.close();
		
		
		//METHOD 3
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number");
		
		int A = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		sb.reverse();
		
		String result = sb.toString();
		System.out.println(A);
		System.out.println(result);
		
		int reversedInt = Integer.parseInt(result);  //SCRAP
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
