package day_18;

import java.util.Arrays;

public class Sort_Method {

	public static void main(String[] args) {
		
		String[] strArr = {"aa", "dd", "cc", "bb"};
		String[] answer = sortedArray(strArr);
		System.out.println(Arrays.toString(answer));		//Arrays.toString..don't forget to print out 
	}

	
	public static String[] sortedArray(String arr[]) {
	
		Arrays.sort(arr);		//can not return directly so..sort first and then 'return' that same value
		return arr;
	}
}
