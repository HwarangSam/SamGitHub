package day_20_arraylist;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {

		ArrayList<String>names = new ArrayList<>();
		
		names.add("TechCircle");
		names.add("Kanin");
		names.add("Sam");
		names.add("Ilham");
		names.add("Charlee");
		names.add("Gift");
		names.add(1, "Park");  //"number, "String"" will assign string to the number's index number
		
//		System.out.println(names.size());	//instead of array.length for arrayList it's .size 
//		
//		System.out.println(names.get(0));  //will pull index number 0  TechCircle
//		System.out.println(names.get(1));	//Park
		
//		System.out.println(names.get(5));	//was Charlee
//		names.remove(5);
//		System.out.println(names.get(5));  //now is Gift
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		
		
		
	}

}
