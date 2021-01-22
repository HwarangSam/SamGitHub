package day_17;

import java.util.Arrays;

public class Multi_Dimensional_Array {

	public static void main(String[] args) {
		
		int nums1[] = {1,3,5,7,8,9};				//rmmr to import arrays util
		int nums2[] = {1,3,5,7,8,9,121};
		int nums3[] = {1,3};
		
		int arr[][] = {nums1, nums2, nums3, {8,6,4,65}};    //array arr is all of the listed arrays
		int arr2[][] = {{5,5,5},{4,4,4,4},{7,7,7,7}};
	
						// first [] accesses first array, second [] accessess the index within the array of the first []
		System.out.println(arr[0][0]); //1
		System.out.println(arr[0][3]); //7
		System.out.println(arr[3][0]); //8 
		System.out.println(arr[3][3]); //65 
		
						//  0   1      2 There are 2 arrays in this array
		//							   array0   array1
//									   0  1    2    3
		int arr3 [][][] = {arr,arr2, {{90,80},{555,444}}};  //3 dimensional arrays are tricky
		
		//first box = firstarray, second box = which array in first array, third box = which item in array
		System.out.println(arr3[0][1][6]);    //121
		
		
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(Arrays.toString(arr[i]));  
//			
//			
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.println(arr[i][j]);	// Printing out each element one by one
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
