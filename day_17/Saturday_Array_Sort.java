package day_17;

import java.util.Arrays;

public class Saturday_Array_Sort {

	public static void main(String[] args) {
		
		int[] arrNumbers = new int [2];
		arrNumbers[0] = 9;
		arrNumbers[1] = 1;
	
		
		//reassign the arrays
		
//		int temp = arrNumbers[0];
//		arrNumbers[0] = arrNumbers[1];
//		arrNumbers [1] = temp;
//		
//		System.out.println(arrNumbers[1]);
				
		//Use for loop
		
//		for (int i = 0; i < arrNumbers.length-1; i++) {	//we have to -1 since we have a +1 in our loop that exceeds parameters
//			int temp1 = arrNumbers[i];
//			arrNumbers[i] = arrNumbers[i + 1];
//			arrNumbers[i + 1] = temp1;				//same logic as above just using i as index "0" and i+1 for index "1"
//		}
//		
//		System.out.println(arrNumbers[1]);
		
		//sort array using nested loop
		//check if number is bigger or less and swap them
		
		int[]arrNumbersToSort = {9,5,6,3,2,8};
		
		//Arrays.sort(arrNumbersToSort);
		
		//Bubble Sorting
//		for (int i = 0; i < arrNumbersToSort.length-1; i++) {	//First loop will loop through ONCE, the second loop makes a loop for each element
//			for (int j = 0; j < arrNumbersToSort.length-i-1; j++) {  //Since the last number post-sort is "done" -i -1(index limit)
//				if (arrNumbersToSort[j] < arrNumbersToSort[j+1]);    //j+1 compares current index its next index
//				int temp = arrNumbersToSort[j];				
//				arrNumbersToSort[j] = arrNumbersToSort[j+1];
//				arrNumbersToSort[j+1] = temp;
//			}
//				}
		
		
		//Make an array of 12x30 and print out in sequential order
		
		
//		int[][]year = new int[12][30];
//		
//		for (int i = 0; i < year.length; i++) {		//loops through each month	//outer loop aka rows
//			
//			for (int k = 0, b=1; k < year[i].length; k++, b++) {  //each year[i] will be 30. Loops through each day of [i] //inner loop
//					year[i][k] = b;
//					System.out.print(year[i][k] + " ");
//				}
//			System.out.println(); //add a space after inner loop
//		}
//		
		
		//Next Task
		
		int[][][]country = new int[50][60][9];   //50 states, 60 counties in each state, 9 cities in each county
		
		for (int i = 0; i < country.length; i++) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
