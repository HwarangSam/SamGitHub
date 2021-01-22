package day_18;

public class Method {
//    modifier  returnType nameOfMethod (Parameter List) 
	public static void main(String args [])  {
		
		printHello();	//calling the method established below. It will run the whole code
		add2Number();
		openBrowser();
		
	}
	
		public static void printHello() {	//this is a method we made
			System.out.print("hello ");
			System.out.print("hello ");
			System.out.print("hello ");
			System.out.print("hello ");
			System.out.print("hello ");	
			System.out.println();
		}
		
		
		public static void add2Number() {	//anotha one
			System.out.println(5+5);
		}

		public static void openBrowser() {
			System.out.println("Opening Chrome browser");
		}
		
		
		
		
		
		
		
	}