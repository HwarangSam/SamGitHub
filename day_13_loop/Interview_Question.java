package day_13_loop;

public class Interview_Question {

	public static void main(String[] args) {
		//3 integars i,j,k from i-j increment and add the sum of, from j-k decrement and continue to add, sum total at end
//		
//		int i = 5;
//		int j = 9;
//		int k = 6;
		
		int sum = 0;
		
		for (int i = 5; i < 9; i++) {
			sum = sum + i;
		}
		for (int i = 9; i >=6; i--) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
	}

}
