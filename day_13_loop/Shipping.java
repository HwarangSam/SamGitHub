package day_13_loop;

public class Shipping {

	public static void main(String[] args) {
		// Create a program to calculate shipping for amazon shopping 
	//  ask user if they are prime member or not / expect yes or no answer 
	// if yes -->> shipping is free 
	// if no -->> 
	// ask user what the amount for your shopping as double 
	// if the number is more than 35 --->> free shipping 
//		 print your total is same number as user entered
	// if the number is less than 35 -->> the add 5 dollar shipping 
	//print your total is 5 dollar more than your number 
		
		String primeMember = "yes";
		double cart = 61.99;
		
		
		if (primeMember.equals("yes")) {
			System.out.println("Your total is $" + cart);
			System.out.println("Your shipping is free");
		}
		if (primeMember.equals("no") && cart < 35) {
			System.out.println("Your total is $" + cart);
			System.out.println("Your shipping is $5");
		}
		if (primeMember.equals("no") && cart >= 35) {
			System.out.println("Your total is $" + cart);
			System.out.println("Your shipping is free");
		}
		
		
		
		
		
		

	}

}
