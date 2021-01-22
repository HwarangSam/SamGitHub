package day_22_oop_encapsulation;

import java.util.ArrayList;

public class ShoppingList {

	public static void main(String[] args) {
		// create 5 objects of item and store to arraylist of Items
		//calc total cost of all items in list
		
		Item shirt = new Item("Hoody", 30, 1);
//		System.out.println(shirt.calcCost());
		
		Item pants = new Item("Jeans", 20, 2);

		Item socks = new Item("Long", 5.50, 5);

		Item panties = new Item("Briefs", 10, 3);
		
		Item shoes = new Item("Nike", 89.99, 1);
	
		ArrayList <Item> shoppingCart = new ArrayList<Item>();  //constructor used in both <>
		
		shoppingCart.add(shirt);
		shoppingCart.add(pants);
		shoppingCart.add(socks);
		shoppingCart.add(panties);
		shoppingCart.add(shoes);
		
		double total = 0;
		
		for (int i = 0; i < shoppingCart.size(); i++) {
			total += shoppingCart.get(i).calcCost();
		}
		
		System.out.println("Your total is " + total);
		
		
		
	}

}
