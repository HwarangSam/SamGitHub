package day_15;

public class Array_Saturday {

	public static void main(String[] args) {

//Make an array from 0-100		//with a LARGE RANGE of an array, instead of writing EACH element, just use FOR LOOP
//		int num[] = new int[100];
//		
//		for (int i = 0; i <num.length; i++) {	//i will always be < less than num.length bc index number is less than length number
//			num[i] = i+1;		//since we want to count up to 100 we are adding by one
//			System.out.print(i + " ");
//		}
//				System.out.println();
//	
		
//Make an array from 100-0
//		for (int i = num.length-1; i >= 0; i--) {
//			System.out.print(num[i] + " ");			
//		}
//		System.out.println();
		
		
//Make an array from 0-100 even numbers
//		
//		for (int i = 0; i <num.length; i++) {
//			if (num[i] % 2 == 0) {
//				System.out.print(num[i] + " ");		
//			}
//		}
//		System.out.println();
		

//Make an array from 0-100 odd numbers

//		for (int i = 0; i <num.length; i++) {
//			if (num[i] % 2 == 1) {
//				System.out.print(num[i] + " ");		
//			}
//		}
//		System.out.println();

//Make an array from 0-100 sum of all numbers
		
//		int sum = 0;		//must be outside of loop apparently
//		for (int i = 0; i <num.length; i++) {
//			sum = sum + num[i];  //OR sum += num[i]
//		}
//		System.out.println(sum);  //also outside of loop because the loop function is for the adding process. Once it's done THEN
//		System.out.println();	  //we want the outcome, single sum number 
		
//Sum of odd numbers
		
//		int sumOdd = 0;
//		for (int i = 0; i < num.length; i++) {
//			if (num[i] % 2 == 1) {
//				sumOdd += num[i];
//			}
//		}
//				System.out.println(sumOdd);
//				System.out.println();
				
//Sum of even numbers
				
//		int sumEven = 0;
//		for (int i = 0; i < num.length; i++) {
//			if (num[i] % 2 == 0) {
//				sumEven += num[i];
//			}
//		}		
//		System.out.println(sumEven);
		
//Average of the sum of odd numbers
		
//		int sumOdd = 0;
//		int oddCount = 0;
//		for (int i = 0; i < num.length; i++) {
//			if (num[i] % 2 == 1) {
//				oddCount++;			//If we don't know the total number to divide by we can make this counter ++
//				sumOdd += num[i];
//			}
//		}
//		int avgOdd = sumOdd/oddCount;
//				System.out.println(avgOdd);
//				System.out.println();
		
				
//Make an array 0-50 odd numbers only and then even numbers only
				
		int arrayOdd [] = new int [50];
		int arrayEven [] = new int [50];
		
		for (int i=0, k=1; i < arrayOdd.length; i++, k+=2) {
			arrayOdd[i] = k;
		}
		
		for (int i=0, k=2; i < arrayEven.length; i++, k+=2) {
			arrayEven[i] = k;
		}
		
		for (int i=0; i < arrayOdd.length; i++) {
			System.out.print(arrayOdd[i] + " ");
		}
		System.out.println();
		
		for (int i=0; i < arrayEven.length; i++) {
			System.out.print(arrayEven[i] + " ");
		}
		
		
		
		
	
				
				
				
				
				
				
	}

}
