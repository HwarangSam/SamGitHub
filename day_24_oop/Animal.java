package day_24_oop;

public abstract class Animal {		//abstract makes it so it can't be called in another class that is not abstract. Can't create an instance of it

	public abstract void play();  //no need for {method body/function}. This is it for abstract method
	
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
