package day_13_loop;

public class Codility {

	public static void main(String[] args) {
		//all numbers divisible by 2 = codility for number N
		//all numbers by 3 = test
		//5 = coders
		//2 and 3 = codilitytest and 2,3,5 etc
		String str = "";
		int N = 1;
		
		while (N <= 24) {

			if (N%2 == 0) {
				str = "Codility";
			}if (N%3 == 0){
					str = str.concat("Test");				
				}if (N%5 == 0) {
					str = str.concat("Coders");
				}if (str.equals("")) {
					System.out.println(N);
				}
			else {
				System.out.println(str);
				
				str = "";
		}
			N++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
