package day_18;

import java.util.Arrays;

public class Dup_Elements_Method {
	
	public static void printDuplicateElement (String[] my_array) {
		String dupElement = "";
		
		for (int i = 0; i < my_array.length; i++) {
			String currentNum= my_array[i];
			int count = 0;
		for (int j = 0; j < my_array.length; j++) {
			if (currentNum == my_array[j]) {
				count++;
			}
		}
		if (count >= 2) {
			if (dupElement.indexOf(currentNum) == -1) {	
				dupElement = dupElement + " " + currentNum;  
			}
		}
	}
		System.out.println(dupElement.trim());
		
	}

	public static void main(String[] args) {
		
		String[] my_array = {"apple", "pear", "orange", "mango", "apple", "Kiwi", "grape"};
		String[] arr = {"2", "3", "3", "3", "3", "3", "3", "2"};	//has to be string since method is string
		
		printDuplicateElement(my_array);
		printDuplicateElement(arr);
	
		
	}
}
