package day_13_loop;
import java.util.Scanner;
public class While_Demo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
	
		int count, number;
		
		number = scan.nextInt();
		count = 1;
		
		while (count <= number){
			System.out.println(count);
			count ++;
		}
		System.out.println();
		System.out.println("Buckle my shoe.");
	
		scan.close();
		
	}

}
