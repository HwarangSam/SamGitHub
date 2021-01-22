package homework;

public class Index_of_Selenium {

	public static void main(String[] args) {
		
		String[] array = {"Java", "JDBC" , "SQL", "Junit", "Selenium", "Jenkins", "Cucumber", "Agile", "SDLC", "WebDriver"};
		
		int index = 0;

		for(int i =0; i < array.length; i++) {
		if (array[i].equals("Selenium")) {
			index = i;
			
			System.out.println(i);
		}
		}
			
		
		
	
	}

}
