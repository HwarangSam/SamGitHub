package day_20_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BulkOperators {

	public static void main(String[] args) {

		Integer numbers [] = {5,1,2,3,4,8,2,3,4,7,2,3,4,5,6,7,8,9,1,2,3,4};
		
//		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(numbers));
		
//		ArrayList <Integer> list2 = new ArrayList<>();
//		
//		list2.add(2);
//		list2.add(5);
//		list2.add(4);
//		list2.add(3);
//
//		boolean result = list1.containsAll(list2);	//does list1 contain everything in list 2?
//		System.out.println(result);					//true
//		
		//Find all odd and even numbers from list1 and group them into 2 array lists
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(numbers));
		ArrayList<Integer> evenNums = new ArrayList<>();
		ArrayList<Integer> oddNums = new ArrayList<>();
		
		for (int i = 0; i < list1.size(); i++) {
			int currentNum = list1.get(i);
			if (currentNum%2 == 0) {
				evenNums.add(currentNum);
			}
			else {
				oddNums.add(currentNum);
			}
		}
		System.out.println(evenNums);
		System.out.println(oddNums);
		
		Collections.sort(evenNums);
		Collections.sort(oddNums);
		
		System.out.println(Collections.max(oddNums));		//FIND MAX MIN WITH COLLECTIONS
		System.out.println(Collections.min(oddNums));
		
		//SECOND LARGEST ODD ELEMENT
		
		oddNums.remove(Collections.max(oddNums));
		System.out.println(Collections.max(oddNums));
		
		//FIND MIN for EVEN and SECOND MIN
		System.out.println(Collections.min(evenNums));
//		evenNums.remove(Collections.min(evenNums));
		System.out.println(Collections.min(evenNums));	//duplicate min element though
		
		ArrayList<Integer> nonDup = new ArrayList<>();
		ArrayList<Integer> unique = new ArrayList<>();
		
		System.out.println(Collections.frequency(evenNums, 2));  //ArrayList, Number in question. There are 4 "2"s.
		
		//WHICH NUMBER DOES NOT HAVE A DUPLICATE (for EVEN ARRAY) //WHAT ARE THE UNIQUE ELEMENTS OF THIS ARRAY
		for(Integer n : evenNums) {		//data type, variable name : array
			int count = Collections.frequency(evenNums, n);
			if(count == 1) {
				nonDup.add(n);
			}			
			if(!unique.contains(n)) {
				unique.add(n);
		}
		System.out.println(nonDup);
		System.out.println(unique);
		}
		
		System.out.println(Collections.min(unique));		//Smallest even number
		unique.remove(Collections.min(unique));
		System.out.println(Collections.min(unique));		//second smallest even number (no duplicates)
		
		
		
		ArrayList<Integer> oddNum2 = list1;
		ArrayList<Integer> evenNum2 = list1;
		
		oddNum2.removeIf(p -> p % 2 == 0);		//lambda
		evenNum2.removeIf(p -> p%2 == 1);		
		
		System.out.println(oddNum2);
		
		
		
		
		
		
		
	}		
}