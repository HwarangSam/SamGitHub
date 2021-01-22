package day_23_oop_inheritance;

public class TestMethodOverload {

	public static void main(String[] args) {
		
		MethodOverloading library = new MethodOverloading();	//will choose appropriate method
		
		System.out.println("Area of square " + library.getArea(5)); 
		System.out.println(library.getArea(2, 5));				
		System.out.println(library.getArea(2.6, 7.5));
	}

}
