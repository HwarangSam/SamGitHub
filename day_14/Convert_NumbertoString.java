package day_14;

public class Convert_NumbertoString {

	public static void main(String[] args) {
		
		
//		int num = 100;		
//		String a = "" + num;
//		
//		System.out.println(a);
//		System.out.println(a.length());
//		System.out.println(a.charAt(0));

		
//		//		//		//		//		//		//		//		//		//
		
		
//		double price = 9.54545;
//		String b = "" + price;
//		
//		System.out.println(b);
//		System.out.println(b.charAt(1));
//		System.out.println(b.indexOf('.'));
//		System.out.println(b.lastIndexOf('4'));
		
		
//		//		//		//		//		//		//		//		//		//		
		
//		
//		int c = 100;
//		String str = Integer.toString(c);
//		long d = 12345L;
//		String str2 = Long.toString(d);
//		
//		System.out.println(str);
//		System.out.println(str2);

		
//		//		//		//		//		//		//		//		//		//
		
		
//		boolean result = true;
//		String str3 = Boolean.toString(result).concat(" false").replace("true", "hello").toUpperCase(); //SHENANIGANS
//		
//		System.out.println(str3);
		
		
		
//		//		//		//		//		//		//		//		//		//
//MULTIPLICATION TABLE
		
//		int num = 8;
//		int result = 0;
//		String msg = "";
//		
//		for (int a = 0; a <= 10; a++) {
//			result = num * a;
//			msg = Integer.toString(num)
//					.concat(" X ")
//					.concat(Integer.toString(a))
//					.concat(" = ")
//					.concat(Integer.toString(result));
//			System.out.println(msg);
//		}
//		
		
//	ALSO MULTIPLICATION TABLE
		
//		int num = 8;
//		int result = 0;
//		
//	
//		for (int a = 0; a <= 10; a++) {
//			result = num * a;
//			System.out.println(num + " X " + a + " = " + result);
//		}

		
		//String.ValueOf(num)
		
//		int num = 123;
//		
//		String str = String.valueOf(num);
//		
//		System.out.println(num);
//		System.out.println(str);
//		System.out.println(str.length());
//		
//		char a = 'u';
//		String str1 = String.valueOf(a);
//		System.out.println(str1.concat(" ") + "and the length of str1 is " + str1.length());
			
		//CONVERT STRING BACK TO NUMBER
		
//		String num = "99";
//		System.out.println(num); //because it is a string it will print out "1" at the end
//		
//		int num2 = 99;
//		String str = "";
//		String str2 = str + num2; 	//same is "" + num2 but..idk just storing str for some reason
//		System.out.println(str2 + 1);
//		
//		int num3 = Integer.parseInt(num);
//		System.out.println(num3 + 1);	//because it is an integer it will ADD "1" to the original integer.
//		System.out.println(num3/50);
//		num3 +=1;
//		System.out.println(num3/5);
//		
//		//in the world of string, everything is a "character" but in the world of primitive numbers everything is math
//		
		
		//Convert to Boolean and Doubles
//		String str = "true";
//		boolean result = Boolean.parseBoolean(str);
//		
//		if (result == true) {
//			System.out.println("str: " + str);
//		}
		
		
		String price = "9.99";
		double valueOfPrice = Double.parseDouble(price);
		
		System.out.println(valueOfPrice + 0.01);

		
		String pageNumber = "55";
		byte name = Byte.parseByte(pageNumber);
		
		System.out.println(pageNumber + 1);	//String
		System.out.println(name + 1);	    //Number
		System.out.println(name + "1");		//1 is now string
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
