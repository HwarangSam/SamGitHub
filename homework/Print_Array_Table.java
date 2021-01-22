package homework;

import java.util.Arrays;

public class Print_Array_Table {

	public static void main(String[] args) {

//Print a 4x3 table where each row ++
		
		int[][]values = new int[4][5];
		
		for (int i = 0; i < values.length; i++) {
			for (int j=0, b=i; j < values[i].length; j++, b++) {		//we use b as another function; b = i as i increases b does too
				values[i][j] = b;					//loop number 'i' becomes the starting number for b 
				System.out.print(values[i][j]);
				
			}
			System.out.println();
		}
		

		
		
		
		
		
		
		
		
	}

}
