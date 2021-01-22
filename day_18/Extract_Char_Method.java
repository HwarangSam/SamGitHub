package day_18;

public class Extract_Char_Method {

	public static void main(String[] args) {
		String str = "a1b2c34d098098efg";
		String str2 = "0123456789";
	
		String answer = extractLetterFromString(str);		//that's the method name smh 
		String answer2 = extractLetterFromString("a1289734892b");  
		System.out.println(answer);	//abcdefg
		System.out.println(answer2);  //ab
		
	}

	public static String extractLetterFromString(String str) {
	
		char a = 'a';
		char z = 'z';
		int numA = a;
		int numZ = z;
		
		String letter = "";
		
		for (int i = 0; i < str.length(); i++) {
			int x = str.charAt(i);
			if (x >= numA && x <= numZ) {
				letter += str.charAt(i);
			}
		}
		return letter;
	}
}
