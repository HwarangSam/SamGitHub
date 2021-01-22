package day_14;

public class The_String_Class {

	public static void main(String[] args) {
	
//		String name = "Sam";
//	//	char firstInitial = "Sam".charAt(0);
//		char firstInitial = name.charAt(0);
//		
//		System.out.println(firstInitial);
		
		
		
//		String name = "TechCircle";
//		System.out.println(name.charAt(0));
//		System.out.println(name.charAt(1));
//		System.out.println(name.charAt(2));	Convert to loop instead of 9 different lines
//		
//		for (int i=0; i<10; i++) {
//			System.out.println(name.charAt(i));
//		};
		
//		if (name.charAt(0) == 'T') {
//			System.out.println(name + " starts with 'T'");
//		}else {
//			System.out.println("First char is not 'T'. It is actually" + name.charAt(0));
//		};
		
	 //PATENT
			//string index	   012345678 etc
//		String patentNumber = "IPR2021-31215646";
//	
//		if (patentNumber.charAt(3) == '2' && patentNumber.charAt(4) == '0' && patentNumber.charAt(5) == '2' && 
//				patentNumber.charAt(6) == '1') {
//					System.out.println("Test case passed - current year is 2021");
//				}else {
//					System.out.println("Test case failed - the year is not updated!");
//				};

		//Check if first and last char are the same for given string
//		String name = "Techcircle";
//		String str = "civic";
			
//		if (str.charAt(0) == str.charAt(4)) {
//			System.out.println("First and last letters are the same");
//		}else {
//			System.out.println("First and last letters are NOT the same");
//		};
//  OR
		
//		int lastNum = str.length()-1;
//		if (str.charAt(0) == str.charAt(lastNum)) {
//			System.out.println("First and last letters are the same");
//		}else {
//			System.out.println("First and last letters are NOT the same");
//			}
//				
//		System.out.println(str.length());	//simply says number of characters in total
//		System.out.println(name.length());
//		
//System.out.println("===========================================");		
//
//		for (int i = 0; i < str.length(); i++) {
//			System.out.println(str.charAt(i));
//		}
		
		//EXTRACT ALL LETTERS FROM THIS STRING
		String alphaNumeric = "a1b2c34d098098efg";
		
		for (int i = 0; i <= alphaNumeric.length(); i++) {
			System.out.println(alphaNumeric.charAt(i));
		};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
