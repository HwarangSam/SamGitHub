package day_10;

public class Relational_Operators_and_Boolean {

	public static void main(String[] args) {
	
		/*
		double priceA = 9.99;
		float priceB = 9.99f;
		double priceC = 9.99;
		boolean resultC = priceA == priceC;
		boolean resultD = priceA != priceC;
		
		System.out.println(priceA == priceB);
		System.out.println("priceA == priceC--->" + resultC);
		System.out.println("priceA != priceC--->" + resultD);
		
		System.out.println(priceA + " == " + priceC + ". The result is = " + resultC);
		
		byte valueA = 8;
		byte valueB = 9;
		
		System.out.println(valueA > valueB);
		System.out.println(valueA < valueB);
		System.out.println(valueA >= valueB);
		System.out.println(valueA <= valueB);
		*/
		
		//increment and decrement 
		
		int numA = 100;
		int numB = 200;
		boolean test = numA == ++numA;
		System.out.println("Value of A = " + numA);
		boolean test1 = numA == numA++;
		
		System.out.println(test1);
		
	}

}
