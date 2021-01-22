package day_20_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Primitive {

	public static void main(String[] args) {

//		ArrayList<Integer> list = new ArrayList<>();
//		
//		list.add(100);		//list.add(3,8) first number is index position, second number is value?
//		list.add(200);
//		list.add(300);
//		list.add(400);
//		list.add(500);
//		
//		list.set(2, 3000);    //replacing/updating a value. Index number and then new value
//		
//		Iterator<Integer> iterator = list.iterator();
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
//		
//		
//		ArrayList<Character> charList = new ArrayList<>();
//		
//		charList.add('a');
//		charList.add('C');
//		charList.add('2');
//		charList.add('^');
//		
//		System.out.println(charList.size());   //4
//		charList.clear();		//clears out the array
//		System.out.println(charList.size());   //0
		
		
		
		//CONVERT ARRAY TO ARRAYLIST
		
		int arr[] = {9,8,7,6,5,4,3,2,1,0};
		int arr2[] = {1,2,3,4,5,6,7,8,9};
		int arr3[] = {15,25,35,45,55,65};
		
		ArrayList<Integer> intArrList = new ArrayList<>();
		
//		for (int i = 0; i < arr.length; i++) {
//			intArrList.add(arr[i]);						//and there it is. Array has been converted to ArrayList
//		}
		
	
		int nums[][]= {arr,arr2,arr3};	//idk wth is going on
		
		for(int[] a : nums) {
			for(int b : a) {
				intArrList.add(b);
			}
		}
		System.out.println(intArrList.size()); //25
		

		
		

//		List<int[]> intArrList2 = Arrays.asList(arr);	//uhhh I think we're adding arrays to the..array..?
//		intArrList2.add(arr2);
//		intArrList2.add(arr3);
//		
//		System.out.println(intArrList2.get(1)[0]);
		
		
	}
}
