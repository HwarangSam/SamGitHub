package day_16;

public class For_Each_Loop {

	public static void main(String[] args) {

		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
		int count = 0;
		
		//DO WHILE LOOP
		
//		do {
//			System.out.println(cars[count]);
//			count++;
//		} while (cars.length > count);
		
		
		//WHILE LOOP
		
//		while (cars.length > count) {
//			System.out.println(cars[count]);
//			count++;
//		}
		
		//FOR LOOP
		
//		for (int i = 0; i < cars.length; i++) {
//			System.out.println(cars[i]);
//		}
		
		
		
		//FOR EACH LOOP 
		
		String firstElement = cars[0];
		
		for (String name : cars) {		//String varName: arrayName
			System.out.println(name);
		}
		
		
		//integer array
		
//		int nums [] = {1,2,5,8,6,4,5,1,2,74};
//		
//		for(int num : nums) {
//			System.out.print(num);
//		}
		
		//CHAR ARRAY
		
//		char charArray [] = cars[0].toCharArray();
//		
//		for(char item : charArray) {
//			System.out.print(item + " ");
//		}
		
		//BOOLEAN ARRAY
//		
//		boolean[] results = {true, true, false};
//		
//		for (boolean item : results) {
//			System.out.println(item);
//		}
//		
//		
		
		
		
		

	}

}
