package day_18;

public class Calculater {

	public static void main(String[] args) {
		
		add2Numbers(1,3);		//parameters are defined now, parallel to below
		sub2Numbers(10, 5.5);
		div2Numbers(20, 8);
		mul2Numbers(5, 5);
	}
	//modifier  //returnType	  //parameters
	public static void add2Numbers(int a, int b) {  //a and b are undefined and will be provided externally
													//now this method has a function with flexible parameters
		System.out.println(a+b);		
	}
	public static void sub2Numbers (int a, double b) { //since it's a separate method we can reuse variable names
		System.out.println(a - b);
	}
	public static void div2Numbers (double a, double b) {
		System.out.println(a / b);
	}
	public static void mul2Numbers(int a, int b) {
		System.out.println(a*b);
	}
	
	
	
	
	
	
	
	
	
}