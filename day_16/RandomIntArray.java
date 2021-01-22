package day_16;

import java.util.Arrays;
import java.util.Random;

public class RandomIntArray {

	public static void main(String[] args) {

//		int nums [] = new int[10];
//		
////		for (int i = 0; i < nums.length; i++) {
////			nums[i] = i + 1;
////		}
//		
//		Random random = new Random();
//		
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = random.nextInt(1000);
//		}
//		System.out.println(Arrays.toString(nums));	//shows which numbers were picked
//		
//		for (int num : nums) {						//shows which were divisible by 5
//			if(num%5 == 0) {
//			System.out.print(num + ", ");
//		}
//		}
		
		//PRACTICE
		
		String names[] = {"Kanin","Park", "Shawn", "Ilham", "Sam", "Sim", "Dilnaz"};
		
		for (String name : names) {			//String name each item in the array is stored under "name": accessing from array "names"
//			if(name.length() < 4) {			//print names with only 3 letters
//			System.out.println(name);
			
//			char charArr [] = name.toCharArray();	//print names containing letters w or z
//			
//			for(char item : charArr) {
//				if (item == 'w' || item == 'z'){
//					System.out.println(name);
//				}
//			}
//		}
//		
		
		//Print names that end with 'm'
			
//			if(name.endsWith("m")) {
//				System.out.println(name);}
//			}
		
		//OR
			
		if(name.charAt(name.length()-1) == 'm') {  //bc it is CHARAT we are == with ' ' instead of " "
			System.out.println(name);
		}
		
		
		
		
		
		
		
		
		}
		

	}

}
