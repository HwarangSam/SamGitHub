package day_14;

public class String_Review_Saturday {

	public static void main(String[] args) {

//		String str = "abc";
//		String str2 = str;
//		String str3 = new String("abc");
//		String str4 = "abc";
//		String str5 = "Abc";
//		
////		System.out.println(str == str2);  //true due to string(data) pull
////		System.out.println(str == str3);  //false bc "new" creates new data location
////		System.out.println(str == str4);  //true
////		
////		System.out.println(str4.equals(str5));  		 //false due to uppercase
////		System.out.println(str4.equalsIgnoreCase(str5)); //true 
//		
//		System.out.println(str5.toLowerCase().equals(str4));               //true
//		System.out.println(str5.toUpperCase().equals(str4.toUpperCase())); //true
//		
//		// == is boolean but .equals lets you manipulate the string
//		
		
	//Task 1
		
		
		String str1 = "This is exercise 1";
		String str2 = "This is Exercise 1";
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("They are equal");
		}else {
			System.out.println("They are not equal");
		}
		
		
		//Task 2
		
		
		String str3 = "PHP";
		String str4 = "Python";
		
		System.out.println(str3.concat(str4));
		
		
		//Task 3
		
		
		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println(str.replace('d','f'));
		
		
		//Task 4
		
		String str5 = "Red is favorite color";
		System.out.println("Red is favorite color. Starts with Red? " + str5.startsWith("Red"));
		
		
		//Task 5
		
	//	Find all the vowels and consonents
		
		String input = "Hello Java is Fun";
		String vowels = "A,E,I,O,U";
		
		//vowels = 6 characters
		//consonents = 8 characters
		
		int vowelCount = 0;
		int consonentCount = 0;
		
		for (int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));
			
			String singleChar = Character.toString(input.charAt(i));
			System.out.println(singleChar);
			
			
			

			
			
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
