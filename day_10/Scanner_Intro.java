package day_10;

import java.util.Scanner;

public class Scanner_Intro {

	public static void main(String[] args) {
		
		//datatype variableName = value
		/*
		Scanner greeting = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String name = scan.nextLine();
		//variable "name" is now useable anywhere else
		System.out.println("Hello " + name);
		
		scan.close();
		*/
		
		Scanner a = new Scanner (System.in);
		
		System.out.println("Please enter your name");
		String name = a.nextLine();
		
		System.out.println("What is your nationality?");
		String citizenship = a.nextLine();
		
		
		System.out.println("What is your age?");
		int age = a.nextInt();
	
		if (citizenship.equals("USA") && age >= 18)
			System.out.println("You are eligible to vote");
		else 
			System.out.println("You are not eligible to vote");
		
		
		a.close();
		
		
		
		
		
		
	}

}
