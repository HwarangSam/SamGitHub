package day_14;

public class Middle_Character {

	public static void main(String[] args) {
//		Write a Java program to find the middle character of a string.  
//		If the length of the string is odd there will be one middle character.
//		
//		b) If the length of the string is even there will be 2 middle characters.
//		Test Data:
//		Input a string: abcde
//		Expected Output: c
//		Input a string: car11car
//		Expected Output: 11 (edited) 
//		
//		String a = "abcde";
//		int middle = a.length() / 2;	
//		System.out.println(a.charAt(middle));
//		
//		String b = "car11car";
//		int middle2 = b.length()/2 - 1;
//		int middle3 = b.length()/2 + 1;
//		
//		System.out.println(b.substring(middle2, middle3));

		String input = "abcde";
		String expectedStr = "c";
		
		if(input.length() % 2 == 1) {	//if it is an odd number
			System.out.println(input.charAt(input.length()/2));
		}else {
			int index1 = input.length()/2-1;
			int index2 = input.length()/2;
				System.out.print(input.charAt(index1));
				System.out.println(input.charAt(index2));
						}
	
			
		
		
		
	
	
	}

}
