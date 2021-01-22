package day_18;

import java.util.Arrays;

public class Method_Arrays {

	public static void main(String[] args) {
		//Find the index number of "Selenium before AND after sorting
		String array1[] = {"Java", "Agile", "JDBC", "SQL", "Selenium", "Junit", "Cucumber", "SDLC", "WebDriver", "Jenkins"};
		
//		for (int i = 0; i < array1.length; i++) {  //rmmr 'i' stands for "index" number
//			if (array1[i] == "Selenium") {
//				System.out.println(i);      //This will produce the INDEX number
//			}
//		}
//		String arr[] = {"1", "2", "3", "4"};
//		loopArray(arr);
//		loopArray(array1);
		
	indexSelenium(array1);	//method 1
	sortIt(array1);			//method 3
	indexSelenium(array1);  //method 1
		
	indexAny(array1, "blah");	//method 4
	indexAny(array1, "Java");
	}
	public static void indexSelenium (String[] name) {
			for (int i = 0; i < name.length; i++) {  
					if (name[i] == "Selenium") {
						System.out.println(i);
					}
				}
			}
	
	public static void loopArray (String name[]) {	
		for (int i = 0; i < name.length; i++) {  
				System.out.println(name[i]);     
			}
		}
	public static void sortIt (String arr[]) {
		Arrays.sort(arr);
	}
	
	public static void indexAny (String[] name, String any) {
		
		boolean isFound = false;
		
		for (int i = 0; i < name.length; i++) {  
				if (name[i] == any) {
					isFound = true;  //if the "if" statement is true THEN everything under "if" statements follow
					System.out.println("Index of " + any + " is " + i);
				}
			}
		if (isFound == false) {
			System.out.println(any + " " + "is not found");
		}
		}
	
	
	
	}
