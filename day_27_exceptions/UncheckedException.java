package day_27_exceptions;

public class UncheckedException {

	public static void main(String[] args) {
		int a, b;
		a = 4;
		b = 0;
		
		try {
		//runtime exception aka unchecked exception
		System.out.println("result: " + a/b);  //will print an error bc can't divide by 0
		}catch(Exception e) {
			e.printStackTrace(); //will tell you location of exception and avoids terminating rest of program
		}
		
		System.out.println("I'm here");  //with the try and catch this line will still print
	
		
		
	
	}

}
