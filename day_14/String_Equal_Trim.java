package day_14;

public class String_Equal_Trim {

	public static void main(String[] args) {

//		String str1 = "Welcome to Java";
//		String str2 = "Welcome to Java";
//		String str3 = "Welcome to C++";
//		
//		System.out.println(str1.equals(str2));	//true
//		System.out.println(str1.equals(str3));  //false
//		
//		String str4 = "Welcome to java"; //lowercased
//		
//		System.out.println(str1.equals(str4)); //false
//		System.out.println(str1.equalsIgnoreCase(str4));  //to ignore upper/lower case discrepancies
		
		//String Trim
		
		String str = "                   hello           ";
		System.out.println(str);
		System.out.println(str.length());  //24 characters
		
		String str2 = str.trim();		//removes all "white space" which are spaces with no preceding or following characters
		
		System.out.println(str2);
		System.out.println(str2.length());  //5 characters
		
		if(str.trim().equals(str2.trim())) {    //playing with trim str2 is already trimmed. the second trim doesn't matter lol
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
