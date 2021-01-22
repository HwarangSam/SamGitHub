package day_24_oop;

import util.AnimalUtilStatic;

public class TestMain {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Shark s = new Shark();
		Horse h = new Horse();
		Cat c = new Cat();
		
		//METHOD 1
		AnimalUtil animalUtil = new AnimalUtil();
		animalUtil.testAnimal(d);
		animalUtil.testAnimal(s);
		animalUtil.testAnimal(h);
		animalUtil.testAnimal(c);
		
		//METHOD 2 STATIC METHOD...i don't see what the difference is 
		//other than that it is static method to call directly. 
		//All it does is bypass the need to call it with AnimalUtil blah = new AnimalUtil();
		AnimalUtilStatic.testAnimal(d);
		AnimalUtilStatic.testAnimal(s);
		AnimalUtilStatic.testAnimal(h);
		AnimalUtilStatic.testAnimal(c);
		
	}
}
