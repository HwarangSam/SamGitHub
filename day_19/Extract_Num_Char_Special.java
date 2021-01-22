package day_19;

public class Extract_Num_Char_Special {

	public static void main(String[] args) {

		String str = "asddf57ksjgs)&@#kjfdg#!1238yksljdhuk";
		
		String digit = "";
		String letter = "";
		String specialChar = "";
		
		for (int i = 0; i < str.length(); i++) {
			char eachChar = str.charAt(i);			//specific
			if (Character.isDigit(eachChar)) {
				digit += eachChar;
			}
			if (Character.isLetter(eachChar)) {
				letter += eachChar;
			}
			if(!Character.isLetterOrDigit(eachChar)) { //the ! means IS NOT letter or digit
				specialChar += eachChar;
			}
				}
			System.out.println(digit);
			System.out.println(letter);
			System.out.println(specialChar);
	}

}
