package day_15;

import java.util.Arrays;

public class Array_Copy {

	public static void main(String[] args) {

		int a[] = {1,3,8};
		int b[] = new int[a.length];
		
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]);
//		}
//
//		for (int i = 0; i < b.length; i++) {
//			System.out.print(b[i]);
//		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		int c[] = Arrays.copyOf(a, 5);
		
		System.out.println(Arrays.toString(c));
		
		
		
		
		
		

	}

}
