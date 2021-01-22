package day_26_saturday;

import java.util.ArrayList;
import java.util.Arrays;

public class MAIN {

	public static void main(String[] args) {
//		Olive olive1 = new Olive();
//		
//		Olive olive2 = new Olive();
//		//update some variables
//		olive2.setName("Makog");
//		olive2.setOil(7);
//		
//		Olive olive3 = new Olive();
//		olive3.setName("Ligurian");
//		olive3.setOil(3);
//		
//		Olive olive4 = new Olive();
//		olive4.setName("Saray log");
//		
//		Olive olive5 = new Olive();
//		olive5.setName("Ligurian");
//		olive5.setOil(3);
//		
//		//now with paramterizes constructor we can update like this
//		Olive olive6 = new Olive("Kalamata", 23654L, 2);  //ctrl space in the () to see parameters check data type
//		Olive olive7 = new Olive("Zeytun", 2304982L, 4);
//		Olive olive8 = new Olive();
//		Olive olive9 = new Olive();
//		
		ArrayList<Olive> list = new ArrayList<>();
//		
//		//list.add(olive1); etc OR
//		
//		list.addAll(Arrays.asList(olive1,olive2,olive3,olive4,olive5,olive6, olive7,olive8,olive9)); //rmmr "list" is the array name
		list.add(new Kalamata());  //add subclasses. Looks cleaner then writing out each parameter
		list.add(new Ligurian());
		list.add(new Makog());
//		
//		//call getOil method here. Since it's not static we have to create an instance
//		
//		//class   //objectName  //Instantiate
		OlivePress press = new OlivePress(); //like this
//		
//		//object.method(variables)
////		press.getOil(list);					//use our object //just prints ouch!
//		
//		//to print out
////		System.out.println(press.getOil(list)); //prints ouch and then oil total
//		
//		
//		//list out olive names
////		for (int i = 0; i < list.size(); i++) {
////			System.out.println(list.get(i).name); //make sure the specify which variable to iterate (in this case 'name')
////		}
//		//print out all olives and how much oil they yield
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getName());
//			System.out.println(list.get(i).crush());
//			System.out.println(list.get(i).getColor());
//			System.out.println();
//		}
		
		
		int total = press.getOil(list);
		
		System.out.println("Total olive units: " + total);		
		
	}

}
