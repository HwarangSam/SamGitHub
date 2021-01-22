package day_19;

public class Wrapper_Autobox_Unbox {

	public static void main(String[] args) {
		
		byte val1 = 28;
		Byte val2 = val1;  //autoboxing
		
		char charValue = 'a';
		Character charValue2 = charValue;  //now charValue as charValue2 can be maneuvered with "."
		
		System.out.println(charValue2.charValue());
		System.out.println(charValue2.isLetterOrDigit(charValue)); //boolean statement if letter or digit and non special character
		
		int numA = 4;
		Integer numB = numA;
		
		System.out.println(numB.intValue());
		
		float numC = 5.6f;
		Float numD = numC;
		
		System.out.println(numD.toString());
		
		//UNBOXING
		
		Integer a = new Integer(10);
		int b = a.intValue();
		
		
		
		
		
		

	}

}
