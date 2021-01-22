package day_24_oop;

public class Dog extends Animal{

	void bark() {
		System.out.println(name + " is barking!");
	}
	
	
	public void walk() {
		System.out.println("Dog is walking");
	}
	
	public void makeSound() {
		System.out.println("Dog is making sound woof woof");
	}


	@Override	//Hover over error and add unimplemented methods
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
}
