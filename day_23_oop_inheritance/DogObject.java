package day_23_oop_inheritance;

public class DogObject {

	public static void main(String[] args) {
		//let's test our dog class
		
//		Dog dog1 = new Dog();
//		
//		dog1.name = "Lucy";
//		dog1.barks();
//		dog1.move();
//		dog1.eat();

		Shark shark = new Shark();
		shark.name = "Bob";
		shark.size = "Large";
		shark.weight = 600;
		shark.eat();
		shark.swim();
	}
}
