package day_18;

import java.util.jar.Attributes.Name;

public class Method_Practice {

	public static void main(String[] args) {
//		task ("Samuel", "TechCircle");
		
		System.out.println(greaterNum(15, 120));
		System.out.println(sumCalc(10,2,3));
		
		System.out.println(getDomain("sam@gmail.com"));
	
		//OR
		String email1 = "sam@yahoo.com";	
		System.out.println(getDomain(email1));
		
	}
		//print out domain name	
	public static String getDomain (String email) {	
		//sysout email.indexOf("@")
		//sysout email.substring(email.indexOf("@")); substring can go from one character to another apparently
		return email.substring(email.indexOf("@")+1, email.indexOf("."));
	}
	public static void task(String name, String school) {	
		hello();
		printName(name);
		hello();
		printName(school);
		hello();
	}
	
	public static void hello() {
		
		for (int i = 0; i <5; i++) {
			System.out.println("Hello");
		}
	}
	
	public static void printName (String name) {
		System.out.println(name);
	}
		
	//write a method for sum of 3 numbers, method to show greater of 2, return
	public static int sumCalc(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}
		public static int greaterNum (int a, int b) {
		int answer = 0;
		if (a > b) {
			answer = a;
		}else {
			answer = b;
		}
		//OR int answer = a>b ? a:b;
		return answer;
	}

	    
} 		
