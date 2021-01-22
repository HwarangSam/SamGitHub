package day_10;

public class Nested_IfElse {

	public static void main(String[] args) {
		
		int temp = 91;
		boolean sunny = true;
		
		if (temp > 90) {
			System.out.println("condition is true");
			if (sunny) 
				System.out.println("Beach");
			else 
				System.out.println("Movie");
		}else {
			System.out.println("condition is false");
			if (sunny) 
				System.out.println("Tennis");
			else 
				System.out.println("Soccer");
		}
			 //what the...how do i get rid of that last line?
	}

}
