package day_18;

public class Saturday_Review2 {

	public static void main(String[] args) {
		

	}

	public static int maxValue(int arr[]) {
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];    //arr[i] = max does not work
			}
		}
		return max;
	}
}
