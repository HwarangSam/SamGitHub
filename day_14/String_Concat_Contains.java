package day_14;

public class String_Concat_Contains {

	public static void main(String[] args) {
		
//		String word = "Java";
//		String word2 = word.concat(" with Eclipse");  //new string has to be made to concat due to immutability
//													  //instead of .concat you can just use + 
//		System.out.println(word);
//		System.out.println(word2);
//		
//		System.out.println(word.concat(" Selenium")); //unstored 
//		System.out.println(word);
		
//Multiplication Table
		
//		int num = 5;
//		int result = 0;
//		
//		for (int i = 1; i<=10; i++) {
//			result = num * i;
//		
//		System.out.println(num + " X " + i + " = " + result);
//		}
		
//CONTAINS
		
//		String email = "test@gmail.com";
		
//		System.out.println(email.contains("@")); //true
//		System.out.println(email.contains("gmail.com"));  //true
//		System.out.println(email.contains("yahoo.com")); //false
		
		
//		String list = "Eggs, Milk, Juice, Pizza, Apple, Bread";
//		
//		if (list.contains("Apple")) {
//			System.out.println("Buy apple");
//		}
//		
//		System.out.println("has eggs: " + list.contains("Eggs")); //true
		
		
// BACK TO EMAIL
		
		String email = "test@yahoo.com";
		
		if(email.contains("gmail.com")) {
			System.out.println("Gmail account");
		}else if (email.contains("yahoo.com")) {
			System.out.println("Yahoo account");
		}else if (email.contains("outlook.com")) {
			System.out.println("Outlook account");
		}else if (email.contains("hotmail.com")) {
			System.out.println("Hotmail account");
		}
		
		
		
		String title = "Car | Carmax";
		
		if(title.contains("|")) {
			System.out.println("pipe is there as expected");
		}else {
			System.out.println("pipe is not there");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
