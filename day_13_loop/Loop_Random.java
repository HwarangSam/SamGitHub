package day_13_loop;
import java.util.Random;   //multiple imported tools can be collapsed
import java.util.Scanner;

public class Loop_Random {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random randomNumber = new Random();
	
		int count = 3;
		
		do {
			System.out.println("Guess a number 0-10");
			int input = scan.nextInt();	
			int comp = randomNumber.nextInt(10);
			
			if (input == comp) {
				System.out.println("You won! You're fly AF");
				break;
			}else if (input > comp) {
					System.out.println("Too high loser!");
			}else if (input < comp) {
				System.out.println("Too low loser!");
			}count--;												//countdown
		}while (count > 0); 										//number of chances you get 	

		scan.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
