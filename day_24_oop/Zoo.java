package day_24_oop;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {

	public static void main(String[] args) {
		
//		Animal a = new Animal();	
//		a.makeSound();
//		a.walk();
		
		Dog dog1 = new Dog();
		
		AnimalUtil au = new AnimalUtil();
		
		au.testAnimal(dog1); //instead of testDog  REFER TO ANIMALUTIL
		
		Horse horse1 = new Horse();
		
		au.testAnimal(horse1);  //instead if testHorse
		
		Animal animal = new Cat(); //overriding
		animal.walk();				//animal has become cat
		
		Animal animal1 = new Dog();
		animal1.makeSound();		//animal1 is now dog
		animal1.walk();
		
		Animal animal2 = new Horse();
		animal2.makeSound();
		animal2.walk();
		
		au.testAnimal(animal1);  //this now the same as dog1
		
		au.testAnimal(new Shark());	//Just another way to do it  //testAnimal method is from animalUtil
//		Shark s1 = new Shark();
		
		ArrayList<Animal> zooList = new ArrayList<>();
		zooList.add(animal);
		zooList.add(animal1);		//idk why he repeated them
		zooList.add(animal1);
		zooList.add(animal);
		zooList.add(animal);
		
		zooList.addAll(Arrays.asList(new Shark(), new Dog(), new Cat()));
		
		System.out.println(zooList.size());
		
		for (int i = 0; i < zooList.size(); i++) {
//			zooList.get(i).makeSound();			//ArrayList is .get() we did.makesound to test specific method
			au.testAnimal(zooList.get(i));
		}
		
		
	}
}
