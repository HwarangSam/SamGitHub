package day_14;

public class Five_Characters {

	public static void main(String[] args) {
//		Write a program that checks the length of the string. If the string length is less than 5 characters then add any character and make it a total of five chars.
//		if the length is equal to 5 then keep the original string. 
//		if string length greater than 5 characters then keep the last 5 characters.
//		Examples:
//		String str1 = "computer"; String str2 = "Java"; String str3 = "Pizza";
//		//expected     “puter” ,                           “JavaA”                   “Pizza”
		
		String input = "zza";
		
		String expectedStr = "";
		
		if (input.length() == 5) {
			expectedStr = input;
		}else if (input.length() > 5) {
			int lastIndex = input.length()-5;
			expectedStr = input.substring(lastIndex);
		}else if (input.length() < 5) {
			switch (input.length()) {
			case 1:
				expectedStr = input.concat("abcd");
				break;
			case 2:
				expectedStr = input.concat("abc");
				break;
			case 3:
				expectedStr = input.concat("ab");
				break;
			case 4:
				expectedStr = input.concat("a");
				break;
				
				}
		}
		
		System.out.println(expectedStr);
		
		
		
		
		
		
		
		
		
	}

}
