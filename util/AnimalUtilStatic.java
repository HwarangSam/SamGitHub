package util;

import day_24_oop.Animal;

public class AnimalUtilStatic {

	public static void testAnimal(Animal a) {	//import animal from Animal Class
		a.makeSound();
		a.walk();
	
		//static makes it DIRECTLY accessible which mean...idk. oh it means you don't have the instantiate it
		//with the whole className blah = new className(); so static makes it more directly called..upon..able
		
	}
}
