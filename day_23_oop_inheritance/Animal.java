package day_23_oop_inheritance;

public class Animal {

	//Instance Variables
	String name;
	String size;
	double weight;
	
	//Instance Methods
	public void eat() {		//public makes it more accessible
		System.out.println(name + " is eating");
	}
	public void move() {
		System.out.println(name+" is moving");
	}
	
	public void walk() {
		System.out.println("Animal is walking");
	}
	
	public void makeSound() {
		System.out.println("Animal is making sound");
	}
	
	
	
	
}

