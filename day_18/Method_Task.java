package day_18;

import java.util.Arrays;

public class Method_Task {

	public static void main(String[] args) {
		
		//Create a method to print out max number from int array
		//same with min
		//print out only unique numbers
	
		int test[] = {3,4,90,1,6,2,0};
		
		maxNum(test);
		minNum(test);
	}
	
	
	public static void maxNum (int array1[]) {
		
//		Arrays.sort(array1);
//		System.out.println(array1[array1.length-1]);
		
		//without sorting IMPORTANT FOR LOGIC
		
		int max = array1[0];	//can be any number but hey lets just index 0
		for (int i = 0; i < array1.length; i++) {  //the loops always starts at; the loops goes through; looping item index increases
			if(array1[i] > max) {
				max = array1[i];		//max will be updated with EACH LOOP
			}
		}
		System.out.println(max);
	}
	public static void minNum(int array[]) {
//		Arrays.sort(array);
//		System.out.println(array[0]);
		
		//without Sort
		int min = array[0];			//can be any number but hey lets just index 0
		for (int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];		//max will be updated with EACH LOOP
			}
		}
		System.out.println(min);
		}	
}
