package day_13_loop;

public class For_Loop {

	public static void main(String[] args) {
		
//		int count = 1;						//all 3 ways can do the same thing
		
//		if (count < 3) {
//			System.out.println(count);
//			count++;
//			}
		
		
//			while (count < 3) {
//				System.out.println(count);
//			 count++;			
//			}
//		
//		for (int count = 1; count <3; count++) {
//			System.out.println(count);
//				}
//		System.out.println("Done");
		
//		for (int i = 10; i >= 1; i -= 2) {		//int i (since it is in the for loop is a local variable
//			System.out.println(i);				//it is only available inside the loop
//		}
//		
//		for (int i = 30; i >= 1; i--) {
//			System.out.println("Variable is:" + i);
//			if (i == 20) {
//				break;
//			}
//		}
//		
//		for (int i = 1; i < 6; i++) {		    //using integar we can manipulate string
//			System.out.println("test");
//			System.out.println("\n");
//		}
//		
	//CRAPPY AMERICAN FLAG	
//		for (int a = 1; a < 6; a++) {
//			System.out.println("**********===============");
//		}
//		for (int b = 1; b < 9; b++) {
//			System.out.println("=========================");
//		}
		
	//ANOTHER WAY
		
		String str1 = "* * * * * *===============";
		String str2 = " * * * * * ===============";
		String str3 = "==========================";
		
		for (int a = 1; a <10; a++) {				//to print a string every other line ooooh but hard way
			if (a % 2 == 1) {						//easier to sysout str1 sysout str2 and then if loop str3
			System.out.println(str1);
			}else 
				System.out.println(str2);
		}
		for (int b = 1; b < 7; b++) {
			System.out.println(str3);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
