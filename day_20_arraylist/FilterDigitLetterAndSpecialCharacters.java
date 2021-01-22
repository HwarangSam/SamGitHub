package day_20_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterDigitLetterAndSpecialCharacters {

	public static void main(String[] args) {
		
		String str = "abc123!@#defg4567$%^hijk890&*()(";
		
//		String arr[] = str.split("\\$");  //turn string into array where the index is split specifically at $ (needed \\exception)
//		System.out.println(arr[0]);	//all char before $ but no $
//		System.out.println(arr[1]); //all char after $ but no $
		
		String arr[] = str.split("");	//splits every element to an index. CONVERT string to ARRAY
		System.out.println(str);		//whole string
		
//		System.out.println(arr[0]);		//a
//		System.out.println(arr[1]); 	//b
//		System.out.println(arr[3]);		//1
//		System.out.println(arr[arr.length-1]); //last index (
		
		
		ArrayList<String> digits = new ArrayList<>(Arrays.asList(arr));	//CONVERT array to arrayList
						//lambda expression
		digits.removeIf(p -> !Character.isDigit(p.charAt(0)));  	//crazy syntax wow...remove if character is NOT digit. P can be anything									
		System.out.println(digits);									//only numbers remain
		
		
		ArrayList<String> specialChar = new ArrayList<>(Arrays.asList(str.split("")));	//option instead of using array
		specialChar.removeIf(blah -> Character.isLetterOrDigit(blah.charAt(0))); //removes all digits and char											 
		System.out.println(specialChar);
		
		
		ArrayList<String> alpha = new ArrayList<>(Arrays.asList(arr));
		alpha.removeIf(x -> !Character.isLetter(x.charAt(0)));	    //removes all non-alphabetic idk if different from .isAlphabetic 
		System.out.println(alpha);									//only letters remain
		
		
		
		
	

	}

}
