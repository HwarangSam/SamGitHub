package day_27_exceptions;

public class StringIndexIssue {

	public static void main(String[] args) {
		
		String str = "Welcome";
		
		char chars[] = str.toCharArray(); //wow I forgot how to do this
		
		//select block of code, right click, surround with, try catch block
		try {
			for (int i = 0; i <= chars.length; i++) { //we'll create error with adding = sign since last index is out of bounds
				char eachChar = chars[i];
				System.out.println(eachChar);
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("I handled the exception");
		//try and catch will allow to program to run and not terminate and then identify the error
		
	}

}
