package day_27_exceptions;

public class FinallyBlock {

	public static void main(String[] args) {
		
		String str = "Welcome";

		char chars[] = str.toCharArray();
		
		try {
			char lastChar = chars[chars.length-1];		//another error
			System.out.println(lastChar);
			
			String str2 = str.substring(10);  //out of bounds
			System.out.println(str2);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {						//code that will always execute
			System.out.println("Cleaning up the code");
		}
		
		
		

	}

}
