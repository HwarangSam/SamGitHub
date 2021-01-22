package day_15;

public class Array {

	public static void main(String[] args) {
		
//		int num1 = 5;
//		int num2 = 8;
//		int num3 = 10;
//		
////		int nums [] = {5,8,10};		//OR
//		//index			0	 1    2	   3  4  5
//		int nums [] = {num1,num2,num3, 0, 1, 0};
//		
//		System.out.println(nums[0]);
//		System.out.println(nums[5]);
		
//		String fruits [];		//you can write it this way, maybe if you don't know the values yet to reserve a space for them
//		fruits = new String [6];
//		fruits[0] = "Apple";
//		fruits[1] = "Grapes";
//		fruits[2] = "Pear";
//		fruits[3] = "Kiwi";
//		fruits[4] = "Mango";
//		fruits[5] = "Orange";
//		
//		System.out.println(fruits[1]);	//"Grapes"
		
//		String [] months = {"January", "February", "March"};
//		System.out.println(months[2]);	//"March"
				//		0 1 2 3 4
//		int[] scores = {1,2,3,4,5};
//		
//		scores[3] = scores[0] + scores[4];
//		
//		System.out.println(scores[3]);  //scores [3] has been reassigned a new value
		

		
		short num[] = new short [1000];
		
	String [] cars = {"Volvo", "Ford", "Toyota"};
		cars[0] = "Honda";
		
		System.out.println(cars[0]);	//This will reassign/update element value
		System.out.println(cars.length);
		System.out.println(num.length);
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);         //if only i it will print out index numbers. 
												 //specify variable and it will output variable elements
		}
		
		
		
		
		
		
		
		

	}

}
