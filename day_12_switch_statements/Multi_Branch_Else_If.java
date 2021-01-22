package day_12_switch_statements;
import java.util.Scanner;
public class Multi_Branch_Else_If {
	
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("What time is it?");
	int time = scan.nextInt();

if (time >= 1 && time <= 24 );{
	
	if (time >= 5 && time < 12) {
			System.out.println("Good Morning");
		}else if (time >= 12 && time < 17) {
			System.out.println("Good Afternoon");
		}else if (time >=17 && time < 24) {
			System.out.println("Good Evening");
		
		}else {
		System.out.println("Invalid Time");}}
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
