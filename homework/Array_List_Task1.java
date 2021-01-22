package homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_Task1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		arr.set(arr.size()-1, 0);
		System.out.println(arr);
	
		//OR
		
		setLastToZero(arr);
		System.out.println(arr);
		
		//OR
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i));
		}
		
		System.out.println();
		//OR
		
		Iterator<Integer> iterator = arr.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
			
		}
	}
		public static ArrayList<Integer> setLastToZero(ArrayList<Integer> nums){
			nums.set(nums.size()-1, 0);
			return nums;
	}
}