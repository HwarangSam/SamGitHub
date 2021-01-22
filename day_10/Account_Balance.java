package day_10;
import java.util.Scanner;
public class Account_Balance {

	public static void main(String[] args) {
		
		Scanner bank = new Scanner(System.in);
		
		final double overDrawnPenalty = 8;
		final double interestRate = 0.02;
		
		System.out.println("Please enter your account balance");
		double balance = bank.nextDouble();
		
		if (balance >= 0) {
			balance = balance + (balance * interestRate)/12;
		}else {
			balance = balance - overDrawnPenalty;
		}
			
		System.out.println("Your new balance is $" + balance);
		
		
		
		
		
		
		
		

	}

}
