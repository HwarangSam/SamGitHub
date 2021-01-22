package day_20_arraylist;

import java.util.ArrayList;

public class Combine2List {

	public static void main(String[] args) {
		
		ArrayList<String> listA = new ArrayList<>();
		
		listA.add("Shafkat");
		listA.add("Mustakil");
		
		ArrayList<String> listB = new ArrayList<>();
		
		listB.add("Shawn");
		listB.add("Nasir");
		listB.addAll(listA); //Super easy. ADD ALL will add entire lists/arrays
		
		System.out.println(listA);  //just ListA
		System.out.println(listB);  //has all names

		ArrayList<String> listC = new ArrayList<>();
		
		listC.add("Ilham");
		listC.add("Andrew");
		
		listB.addAll(2, listC); //index number to insert/add listC
		System.out.println(listB);
		
	
	}

}
