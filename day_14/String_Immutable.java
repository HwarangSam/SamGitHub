package day_14;

public class String_Immutable {

	public static void main(String[] args) {
		
		String str1 = "Hello World";
		String str2 = "Hello ";
		String str3 = "World";
		
		String str4 = str2 + str3;
		
		System.out.println("This is str1: " + str1);
		System.out.println("This is str4: " + str4);
		
		if (str1 == str4) {
			System.out.println("They are equal");
		}else {
			System.out.println("They are not equal");
		};
		//They will NOT be equal. In Java it's called "string pull" bc str4 is not a new string but is pulling str2 and str3.
		//str4 and str2+3's data are stored in different locations
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
