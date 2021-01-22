package day_18;

public class Return_Method {

	public static void main(String[] args) {
		
		return10();
		
		int newNumber = return5();
		System.out.println(newNumber);
		
		double result = sum(1,5.8);
		System.out.println(result);
		
		int numA = 10;		//another way of doing it
		int numB = 9;
		int result1 = sub(numA, numB);
		System.out.println(result1);
		
		System.out.println(mult(3, 10)); //hard coding way to do it
		
		System.out.println(div(3, 10));
	}
	
	public static void return10 () {		//replace void with the return data type. btw parameters are not always necessary
		System.out.println(10);
	}
	
	public static int return5() {
		int num = 5;
		return num;			//keep in mind we didn't sysout 5 we just declared this method as being int 5
	}
	
	public static double sum (int a, double b) {
		return a+b;
	}
	
	public static int sub (int a, int b) {
		return a-b;
	}
	public static float mult(float a, float b) {
		return a * b;
	}
	public static float div(float a, float b) {
		return a / b;
	}
}
