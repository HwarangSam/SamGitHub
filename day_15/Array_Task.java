package day_15;

import java.util.Arrays;

public class Array_Task {

	public static void main(String[] args) {
		
		//1. Find the largest element
		//2. Find the sum of all the elements
		//3. Find the average of all the numbers
		
//		int nums[] = {3,8,1,6,7,8,454,6,48,45};
//	
//		Arrays.sort(nums);
//		
//		System.out.println(nums[nums.length-1]);
//		
//		
//		//TASK 2
//		
//		int sum = 0;
//		for (int i = 0; i < nums.length; i++) {			
//			sum = sum + nums[i];		//OR sum += nums[]; //it can't just be i because i is the INDEX number, not the array value	
//		}
//		System.out.println(sum);
//		
//		
//		//TASK 3
//		
//		int average = sum/nums.length;
//		System.out.println(average);
//		//OR System.out.println(sum/nums.length);  //but i believe this is called hard-coding. Makes it hard to alter variables
//		
		//TASK 4
		//convert string to char array
		
//		String str = "Learning Java";
//		char chars[] = str.toCharArray();
//		
//		for (int i = 0; i < chars.length; i++) {
//			System.out.println(chars[i]);
//		}
		
		
		//TASK 5 idk
		
//		String arr[] = {"Irfan", "Shafkat", "Ilham", "Syed", "Park", "Beenish", "A", "a", "1"};
//		
//		Arrays.sort(arr);
//		
//		System.out.println(Arrays.toString(arr));
//		
		//Numbers are first, Capitalized words, and then lower cased
		
		
		
		int arr[][] = new int [5][5];
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				col = row + col;
				System.out.println(Arrays.toString(arr[row]));
			}
			
		
		
	}

}
}
