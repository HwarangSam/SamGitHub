package day_24_oop;

public class Cat extends Animal{
	public void walk() {
		System.out.println("Cat is walking");
	}
	
	public void makeSound() {
		System.out.println("cat is making sound meow");
	}
	@Override	//override due to abstract method from animal class.  Hover over error and add unimplemented methods
	public void play() {
		System.out.println("Cat is playing with ball");
	}
}
