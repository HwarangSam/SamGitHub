package homework;

public class Extract_From_String {

	public static void main(String[] args) {
		/*Write a program to extract all the letter from a given alphanumeric string "a1b2c34d098098efg"
		output:
		abbdefg
		*/
		
		String str = "a1b2c34d098098efg";
		String str1 = "abcdefghijklmnop";
		String str2 = "0123456789";

//				
//		for (int i = 0; i < str.length(); i++) {
//							
//				if (alphaStr.contains(Character.toString(str.charAt(i)))) {
//				System.out.print(str.charAt(i));
//				}
//			}
//		
//		
	
// METHOD 2		
//String result = "";
//		
//		for (int i = 0; i < str.length(); i++) {
//			
//			if(!numStr.contains(Character.toString(str.charAt(i)))) {
//				result += str.charAt(i);
//			} 
//		}
//		
//		System.out.println(result);

		//METHOD 3
	
//		int numA = 'a';
//		int numZ = 'z';
//		
//		
//		for (int i = 0; i <str.length(); i++) {
//			int x = str.charAt(i);
//		if (x >= numA && x <= numZ) {
//			System.out.print(str.charAt(i));
//		}
//		}
		
//METHOD 4 finish later
		
		char a = 'a';
		char z = 'z';

		int numA = a;
		int numZ = z;
		
		for (int i = 0; i < str.length(); i++) {
			int x = str.charAt(i);
			if (x >= numA && x <= numZ) {
			System.out.print(str.charAt(i));
		}

		if (str2.contains(Character.toString(str.charAt(i)))) {
			System.out.print(str.charAt(i));
		}
		if (x < numA || x > numZ) {
			System.out.print(str.charAt(i));
		}
		}
		
		

}
}


