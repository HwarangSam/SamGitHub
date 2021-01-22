package day_20_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iterable {

	public static void main(String[] args) {
		
		ArrayList<String>names = new ArrayList<>();
		
		names.add("TechCircle");
		names.add("Kanin");
		names.add("Beenish");
		names.add("Ilham");
		
		Iterator<String> iterator = names.iterator();	//This is how to iterate. Print out whole array
		while(iterator.hasNext()) {
			System.out.println(iterator.next());		//printed out whole array
			
//			if (iterator.next().equals("Ilham")) {
//				iterator.next().toUpperCase();
//			}
		}
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
	}

}
}