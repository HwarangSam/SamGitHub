package day_21_constructor;

public class Car {								//our CLASS is Car. It is our blueprint. No main method
												//This is our blueprint for our Car object
		
		String make;		//Instance Variable -> inside of a class and outside of any method
		String model;
		int year;
		int engineSize;
		int MAXSPEED;
		
		public void getInfo() {
			System.out.println("make: "+ make);
			System.out.println("model: "+ model);
			System.out.println("year: "+ year);
			System.out.println("engineSize: "+ engineSize);
			System.out.println("MAXSPEED: "+ MAXSPEED);
		}
		
		public void start() {			//These are our methods
		System.out.println("Start the car");
		}
		public void stop() {
			System.out.println("Stop the car");
		}

}
