package day_10;

public class Logical_Operators {
	
public static void main(String[] args) {
	
//logical operators: and(&&), or(||), not (!)
	
	/*
	boolean A = true;
	boolean B = false;
	boolean C = true;
	
	//true and true = true		my apple is red and round
	//true and false = false	my apple is red and square
	//false and false = false	my apple is blue and square
	
	System.out.println(A && C);
	
	System.out.println(A && B);
	
	System.out.println(B && false);
	
	
	int num1 = 10;
	int num2 = 11;
	
	System.out.println(num1 == 10 && num2 == 11);
	System.out.println(++num1 == num2 && num1 == num2);
	System.out.println(num1);
	//num1 is now 11
			//num1 is 11 in this comparison and then becomes 12 since ++ is after value
	boolean part1 = num1++ == num2;
	boolean part2 = num1 >= num2;
	
	System.out.println(part1 && part2);
	//since num1 is now 12 it is TRUE that num1 is greater to or equal to num2 and since both
	//statements are TRUE, the result is TRUE
	*/
	
	int num1 = 10;
	int num2 = 11;
	boolean c = true;
	boolean d = false;
	/*
	System.out.println(num1 > num2 || num2 > num1);
	
	//with logical OR only false and false will equal false
	
	System.out.println(c == false || d == false);
	System.out.println(c == false || d == true);
	*/
	System.out.println(d!= true);//d is false..therefore d NOT equal to TRUE is TRUE
	
	System.out.println(!c);
	System.out.println(!d);
	System.out.println("value is c is " + c + " or " + !c);
	
}
}
