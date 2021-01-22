package day_20_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLength10 {

	public static void main(String[] args) {
//		1. create an Array of string called country names
//		2. write a program that can remove all the country names that have length of 10 or greater
		
		
		String[] countries = {"United States of America", "Europe", "Antigua", "Spain", "France", "Republic of Korea"};
		
		
// 		METHOD 1
//		ArrayList<String> list = new ArrayList<>(Arrays.asList(countries)); //arrays list is called "list"
//			
//		list.removeIf(c -> c.length() >= 10);   //the lambda variable is odd
//		
//		System.out.println(list);
		
		

		//METHOD 2
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < countries.length; i++) {
			if(countries[i].length()<10) {
				list.add(countries[i]);
			}
		}
		System.out.println(list);
		
		
		
		//METHOD 3
//		
//		int count = 0;
//		for (int i = 0; i < countries.length; i++) {
//			if(countries[i].length()<10) {
//				count++;			//this is all to find the index number of our final array
//			}
//		}
//		String arr[] = new String[count];  //just to do this
//		
//		int index = 0;
//		
//		for (int i = 0; i < countries.length; i++) {
//			if (countries[i].length()<10) {
//				arr[index] = countries[i];
//				index++;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		
	}
}
