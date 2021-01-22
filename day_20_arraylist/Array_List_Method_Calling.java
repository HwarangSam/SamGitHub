package day_20_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import  homework.Array_List_Task1;	//we can also do it like this
import static homework.Array_List_Task1.setLastToZero; //THIS is also another way to call with just method name
import static homework.Array_List_Task1.*; //THIS means importing all methods from this package

public class Array_List_Method_Calling {

	
	
public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(100);
		
		homework.Array_List_Task1.setLastToZero(nums);	//imported from different package AND class
		System.out.println(nums);
		
		//OR with the package import above
		
		Array_List_Task1.setLastToZero(nums);
		System.out.println(nums);
		
		//OR with the import static
		
		setLastToZero(nums);
		System.out.println(nums);
		
		int maxNumber = ArrayList_MaxNum_Method.arrayListMaxNum(nums);
		System.out.println(maxNumber);
		
	}
}
