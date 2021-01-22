package day_23_oop_inheritance;

public class MethodOverloading {
		
		//Many method with same name in same class, also called compile time polymorphism
		//compile time = method overloading (Same class with several methods with the same name
		
		//run time = method overriding. Achieved when parentClass object = new childClass();
		
		//square
		
		public int getArea(int a) {
			return a * a;
		}
		public double getArea(double a) {
			return a * a;
		}
		public int getArea(int a, int b) {
			return a * b;
		}
		public double getArea (double a, double b) {
			return a * b;
		}
		

}
