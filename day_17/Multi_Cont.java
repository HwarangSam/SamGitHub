package day_17;

import java.util.Arrays;

public class Multi_Cont {

	public static void main(String[] args) {
		
//		int max = 0;
//		int min = 10;
//		int x1[] = {4,6,2,5};
//		int x2[] = {7,9,4,8};
//		int x3[] = {6,9,3,7};
//		int arr[][] = {x1,x2,x3};
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//			if (arr[i][j] > max) {
//				max = arr[i][j];
//				}
//			if (arr[i][j] < min) {
//				min = arr[i][j];
//			}
//			}
//		}
//		System.out.println("This is the max number: " + max);
//		System.out.println("This is the min number: " + min);
		
		
		//NEXT TASK //assign a value only when the row # matches the column # in a 5x5 matrix or any size matrix
		
		int[][]matrix = new int [7][7];
		
//		matrix[0][0] = 1;
//		matrix[1][1] = 2;
//		matrix[2][2] = 3;
//		matrix[3][3] = 4;
//		matrix[4][4] = 5;
		
		for (int row = 0; row < matrix.length; row++) {
//			System.out.println(Arrays.toString(matrix[row]));
			for (int col = 0; col < matrix[row].length; col++) {
				if (row == col) {
					matrix[row][col] = row + 1;
				}
				
			}
			System.out.println(Arrays.toString(matrix[row]));
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
