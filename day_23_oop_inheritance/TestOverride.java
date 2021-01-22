package day_23_oop_inheritance;

public class TestOverride {

	public static void main(String[] args) {
		
		Parent obj1 = new Parent();
		
		Parent obj2 = new Child(); //Parent is the superclass but we're initializing object as Child class object
		obj2.show(); 		//show method from Child class

	}

}
