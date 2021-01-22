package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_List_Task2 {

	public static void main(String[] args) {
		// 2. write a program that can multiply each odd number by 2
//			list = [1,2,3,4,5];
//			output: [2,2,6,4,10]
		
		Integer [] nums = {1,2,3,4,5};
		
		ArrayList<Integer> numsList = new ArrayList<>(Arrays.asList(nums));
		
		for (int i = 0; i < numsList.size(); i++) {
			int currentNum = numsList.get(i);
			if(currentNum% 2 == 0) {
				currentNum = currentNum*2;
				}
		}
		System.out.println(numsList);
		
		
		
	}

}
