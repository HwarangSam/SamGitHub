package homework;

import java.util.Arrays;

public class Remove_Duplicate {

	public static void main(String[] args) {
		//Write a Java program to find the duplicate values of an array of integer values.
//		int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
//
//		String[] my_array = {"apple", "pear", "orange", "mango", "apple", "Kiwi", "grape"};


		int [] arr = {1,2,5,5,6,6,7,2};
		int length = arr.length-1;
		int [] temp = new int [length];
		int x = 0;

		Arrays.sort(arr);
		
		for (int i = 0; i < length; i++) {
			if (arr[i] != arr[i+1]) {    //if they are not equal then..
				temp[x++] = arr[i];		//..then store the first of the two. The last element is not included
			}
		}

		temp[x++] = arr[length]; //this is to store the last number in the array
		
		for (int j = 0; j < x; j++) {
			System.out.print(temp[j] + " ");
		}
		
//Do this without sorting

		
		
		
	}
}
