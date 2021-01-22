package day_14;

public class String_Replace {

	public static void main(String[] args) {
				
		String word1 = "car";
		String word2 = word1.replace('r', 't');
		String word3 = word1.replace("car", "automobile");
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
		
		
//		//		//		//		//		//		//		//		//		//
		
		
		String list = "Java, Eclipse, Python, Jenkins, Tomcat, JUNIT";
		String list2 = list.replace("JUNIT", "TestNG");
		
		System.out.println(list);
		System.out.println(list2);
		
		
//		//		//		//		//		//		//		//		//		//
		
		
		String email = "test@gmail.com";
		String domainName = "techcircle";
		String newEmail = email.replace("gmail", domainName);
		
		System.out.println(newEmail);
		
		
//		//		//		//		//		//		//		//		//		//		
		
		
		String str = "Java is fun";
		String str2 = str.replace(" ", "");			//replace will replace all matching strings
		
		System.out.println(str);
		System.out.println(str2);
		
		
//		//		//		//		//		//		//		//		//		//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
