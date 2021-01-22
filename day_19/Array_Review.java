package day_19;

import java.util.Arrays;

public class Array_Review {

	public static void main(String[] args) {
		
		double arr1[] = {0.2,2.5,5.25,1.6,3.0};
		double num = 9.9;
	
		System.out.println(Arrays.toString(addInt(arr1,num)));
	}
	//method to add new int after double array
	
	public static double[]addInt(double arr[], double a){
	
	double expected[] = new double [arr.length+1];  //plus 1 for new Int to be added
	int index = 0;
	
	for (int i = 0; i < arr.length; i++) {
		expected[index] = arr[i];		//the array in focus being modified is first, the changing element is second
		index++;
	}
	expected[index] = a; 	//irfan did it a little different
	return expected;
}
}