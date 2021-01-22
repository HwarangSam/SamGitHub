package day_20_arraylist;

import java.util.Iterator;
import java.util.ArrayList;

public class ArrayList_MaxNum_Method {

	public static int arrayListMaxNum(ArrayList<Integer> nums) {
		int maxNum = nums.get(0);
		Iterator<Integer> iterator = nums.iterator();
		
		while (iterator.hasNext()) {
			
			int currentNum = iterator.next().intValue();
			
			if (currentNum > maxNum) {
				maxNum = currentNum;
			}
		}
		
		return maxNum;
	}
	}
