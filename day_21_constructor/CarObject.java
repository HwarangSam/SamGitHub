package day_21_constructor;

public class CarObject {

	public static void main(String[] args) {
		  //var name  //default constructor
		Car car1 = new Car();			//we created an instance of our Car object (since car class is in same package
										//if you hover over "car" and press ctrl and left mouse click
		car1.engineSize = 8;			//we assign values using our car class.
		car1.year = 2020;
		car1.make = "Honda";
		car1.MAXSPEED = 160;
		car1.model = "Pilot";
		
		car1.start();	//if you run the console it will run the method
		car1.stop();
		
		System.out.println("*********************************************");
		
		car1.getInfo();
		
		System.out.println("*********************************************");
		
		Car car2 = new Car();
		
		car2.make = "Tesla";
		car2.model = "Model X";
		car2.engineSize = 0;
		car2.MAXSPEED = 200;
		car2.year = 2020;
		
		car2.getInfo();
		
		

	}

}
