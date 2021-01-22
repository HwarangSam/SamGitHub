package day_13_loop;
import java.util.Scanner;

import day_10.Scanner_Intro;
public class Loop_Tasks {

	public static void main(String[] args) {
		//TASK 1
		//Write program to print numbers 20-30. you can use
		//for loop, while loop, do while loop
		
		//TASK 2
		//Write a program to calculate the sum of 1-100
		
		//TASK 3
		//Write a program that asks user to input positive integer. It should then print the multiplication table of that number
				
//TASK 1
		
//		for (int i = 20; i <= 30; i++) {
//			System.out.println(i);
//		}
		
		//OR
		
//		int num = 20;
//		do {
//			System.out.println(num);
//			num++;
//		}while(num <= 30);
//		
		//OR
		
//		int num = 20;
//			while (num <= 30) {
//				System.out.println(num);
//				num++;
//			}
//			
		
		
//TASK 2
//		
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);  	//since sysout is outside the curly bracket it will print AFTER loop has ended
		
//OR to show all numbers as they are added
		
//		int sum = 0;
//		for (int i = 1; i <=100; i++) {
//			System.out.println(sum = sum + i);	//since sysout is within the curly brackets it will print with each loop
//		}
		
		
//TASK 3
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number");
		
		int input = scan.nextInt();
		int result = 0;
		
		for (int i = 1; i < 11; i++) {
			result = input*i;
			System.out.println(input + " X " + i + " = " + result);
		}
		
		scan.close();

		//OR
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your number");
//		
//		int input = scan.nextInt();
//		
//		for (int i = 1; i < 11; i++) {
//			System.out.println(input + " X " + i + " = " + input*i);
//		}
//		
//		scan.close();	
//		
//		
		
		
		
		
		
		
	}

}
