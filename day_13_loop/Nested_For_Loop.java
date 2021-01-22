package day_13_loop;

public class Nested_For_Loop {

	public static void main(String[] args) throws InterruptedException {
		
//		for (int i = 1; i < 6; i++) {        //what's nested becomes the variable of the loop that envelops it
//			for (int j = 1; j < 6; j++) {    //inner loop and outer loop
//				System.out.println(j);		 
//			}
//			System.out.println("====================");
//		}
//		
		
		
		
//		for (int i = 1; i < 6; i++) {        //here we can see how the both variables run the code
//			for (int j = 1; j < 6; j++) {    //i doesn't move on until j finishes (breaks the loop via conditions)
//				System.out.println("value of i:" + i + " value of j:" + j);		 
//			}
//			System.out.println("====================");
//		}
			
		
		//CLOCk/TIMER    
//		System.out.println("Start");
//		 // where we start//as long as//action
//		for (int i = 59; i >= 0; i--) {
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
//		
//		System.out.println("Done");
		
		
		//PRACTICE count 10-1 5 times
		
		for (int i = 1; i < 6; i++) {
			for (int j = 10; j >= 1; j--) {
				System.out.println(j);
			}
				System.out.println("-----------------");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
