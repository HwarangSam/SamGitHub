package day_14;
import java.util.Random;
public class String_Review {

	public static void main(String[] args) {

//find the domain name of given email address
		
		String email = "test@gmail.com";
		
//		System.out.println(email.indexOf("@"));
//		System.out.println(email.substring(4)); //or plus 1 to omit the @
		
		//or int domainPosition = email.indexOf("@")
		//and then email.substring(domainPosition)
		
//MAKE IT CLEANER. DOMAIN ONLY
		
//		int IndexOfAt = email.indexOf("@");
//		int IndexOfDot = email.indexOf(".");
//		
//		String domainName = email.substring(IndexOfAt +1, IndexOfDot);
//		
//		System.out.println(domainName);

		
//		char a = 'a';
//		char z = 'z';
//		
//		int value = a;    //97
//		int value2 = z;   //122
//		
//		char charValue = ' ';
//
//		for (int i = value; i <= value2; i++) {
//			charValue = (char)i;		//casting with char
//			System.out.println(charValue);
//		}
//		
		
		Random random = new Random();
		
		String part1 = "703";
		
		int num2 = random.nextInt(1000);  
		int num3 = random.nextInt(10000); //you can just concatenate OR
	
		String part2 = Integer.toString(num2);
		String part3 = Integer.toString(num3);
		
		String phoneNumber = "(".concat(part1).concat(")").concat(part2).concat(part3);
		
		System.out.println(phoneNumber);
		
		
		
		
		

	}

}
