package day_15;

public class Array_cont {

	public static void main(String[] args) {

		String[] my_array2 = {"Java", "JDBC", "Selenium", "Jenkins", "Cucumber", "Agile", "SDLC", "WebDriver"};
		
		boolean isFound = false;
		
		for (int i = 0; i < my_array2.length; i++) {		
		if (my_array2[i].equals("Jenkins")) {
			isFound = true;
			System.out.println("Index number of Jenkins is " + i);
			}
		}
		if (isFound) {
			System.out.println("Jenkins is there");
		}else {
			System.out.println("Jenkins is not there");
		}
			
			
			
			
//			
//			if(my_array2[i].equals("Jenkins")) {
//				System.out.println("Jenkins is found");
//		} else {
//			System.out.println("Jenkins is not found");
//		}
//}
	
		
		
		
		
		
		
		
		
		
		
	}

}
