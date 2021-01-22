package day_14;

public class String_Cont {

	public static void main(String[] args) {

//		String name = new String("techCircle");		//String constructor. Always creates a new string with it's own data.
//		String str = "techCircle";					//String without 'new', java will 'pull' if string is duplicate
//		String name1 = new String("techCircle");
//	
////		System.out.println("This is the original name: " + name);
////		System.out.println("toupperCase " + name.toUpperCase());
//		
//		String name2 = name.toUpperCase();
//		
//		if (name.equalsIgnoreCase(name2)) {
//			System.out.println(name.concat(" and ").concat(name2).concat(" are a match"));
//		}else {
//			System.out.println(name + " and " + name2 + " are not a match");
//		};
//		
//		//OR
//		
//		if (name.toUpperCase().equals(name2.toUpperCase())) {
//			System.out.println(name + " and " + name2 + " are a match");
//		}else {
//			System.out.println(name + " and " + name2 + " are not a match");
//		};
		
		
//		
//		String str1 = "teST";
//		String str2 = str1.toUpperCase();
//		
////		System.out.println(str1 + " | " + str2);
//		
//		boolean result1 = str1.equals(str2);
//		boolean result2 = str1.equalsIgnoreCase(str2);
//		
//	System.out.println(result1);	//false bc case sensitive
//	System.out.println(result2);	//true because ignore case sensitivity
//		
//		boolean result3 = str1.toUpperCase().trim().equals(str2.toUpperCase().trim());	//can add trim to operators as well.
//		
//		System.out.println(result3); //true
//		
		
		//To Lower Case
		
//		String str1 = "HELLO";
//		String str2 = str1.toLowerCase();
//		System.out.println(str1.toLowerCase());
//		
//		boolean result1 = str1.equals(str2);
//		
//		System.out.println(result1);   //false
//		
//		boolean result2 = str1.toLowerCase().equals(str2);	  //using to.LowerCase()
//		
//		System.out.println(result2);  //true
//		
//		boolean result3 = str1.equalsIgnoreCase(str2);		//using ingorecase()
//		
//		System.out.println(result3);
//		
		
		//INDEX OF
			//		   012345678 9 etc.
//		String name = "President George Washington";
//		
//		System.out.println(name.indexOf('e'));
//		System.out.println(name.indexOf('e',3));
//		System.out.println(name.indexOf('G'));
//		System.out.println(name.indexOf("George"));
//		System.out.println(name.indexOf("rge"));
//		System.out.println(name.indexOf("z"));		//will be -1
//		
//		System.out.println(name.charAt(21));
//		System.out.println(name.lastIndexOf('i'));
//		
		
		//find index position of the space on both sides of the -
		
//		String title = "Java - Google search";
//		
//		int indexOfDash = title.indexOf('-');		//will be 5
//		int firstSpace = indexOfDash -1;			//will be 4
//		int secondSpace = indexOfDash +1;			//will be 6
//		
//		if (title.charAt(firstSpace) == ' ') {
//			System.out.println("First space found at index " + firstSpace);
//		}
//	
//		if(title.charAt(secondSpace) == ' ') {
//			System.out.println("Second space found at index " + secondSpace);
//		}
		
		
		//Finding in LIST
		
		String list = "Java, Eclipse, Python, Jenkins, Tomcat, JUNIT";
		
		if (list.contains("Jenkins")){
				System.out.println("Jenkins is there");
				}
		
		System.out.println(list.indexOf("Python"));
		System.out.println(list.indexOf("C#"));
		
		if (list.indexOf("Java") > -1) {	//which is to say..the string exists
			System.out.println("Java is found");
		}else {
			System.out.println("Java is not found");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
