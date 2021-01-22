package day_18;

import java.util.Arrays;

public class Saturday_Review {

	public static void main(String[] args) {
		
////		int count = frequencyOfChar("abcdessssfffffddddd", 'f');
////		System.out.println("Search value occured " + count + " times");
//		
//		//print only unique characters
//		
//		String str = "abbbccddddbbbbbbbef";
//		String unique = "";
//		
//		for (int i = 0; i < str.length(); i++) {
//			char each = str.charAt(i);
//			int count = frequencyOfChar(str, each);
//			if (count == 1) {
//				unique += each;
//			}
//		}
//		System.out.println(unique);
//	}
//	
//	
//		public static int frequencyOfChar(String str, char searchValue) { 
//		int count = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == searchValue) {
//				count++;
//			}
//		}
//		return count;
		
		int arr1[] = {1,1,1,1,1};
		int arr2[] = {2,2,2,2,2};
		int arr3[] = combine2IntArray(arr1,arr2);
		System.out.println(Arrays.toString(arr3));
		

	}
		public static int smallestNum(int arr[]) {
			
			int smallest = arr[0];
			
			for (int i = 0; i < arr.length; i++) {
				int currentNum = arr[i];
				
				if(currentNum < smallest) {
					smallest = currentNum;
				}
			}
			return smallest;
		}	
		
		public static int[]combine2IntArray(int arr1[], int arr2[]){
			
//			int arr1[] = {1,1,1,1,1};
//			int arr2[] = {2,2,2,2,2};
			
			int expected[] = new int [arr1.length + arr2.length];
			int index = 0;
			
			for (int i = 0; i < arr1.length; i++) {
				expected[index] = arr1[i];
				index++;
			}
			for (int i = 0; i < arr2.length; i++) {
				expected[index] = arr2[i];
				index++;
			}
			return expected;
		}
	}