package day_27_exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		String str = "Welcome!";
		
		char chars[] = str.toCharArray();
		
	
		try {
			char lastChar = chars[chars.length];		//another error
			System.out.println(lastChar);
			
			String str2 = str.substring(10);  //out of bounds
			System.out.println(str2);
		} catch (Exception e) {		//smaller exception first
			e.printStackTrace();
		} catch (Throwable e) {		//bigger exception second
			e.printStackTrace();
		
	
		System.out.println("End of program");
		
		
		
		
		
		
		
	}
}