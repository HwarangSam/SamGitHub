package day_18;

import java.util.Scanner;

public class Method_Timer {

	public static void main(String[] args){
		
		timer();		
	}
	
	public static void timer () {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter wait time in minutes");
	
	for (int b = scan.nextInt(); b >= 0; b--) {
		for (int i = 59; i >=0; i--) {
			System.out.println((b-1) + " minutes and " + i + " seconds left");
			try {								//this was just from hover and 2nd option
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	scan.close();
	System.out.println("Time's Up!");
	}
}
