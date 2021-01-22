package day_19;

public class Unboxing {

	public static void main(String[] args) {
		
		String str = "123";
		
		int num = Integer.parseInt(str);		//parse turns string into primitive type
		
		byte b = Byte.parseByte(str);
		
		short s = Short.parseShort(str);
		
		long l = Long.parseLong(str);
		
		int num2 = Integer.valueOf(str);
		
	System.out.println(Byte.MAX_VALUE);
	System.out.println(Byte.MIN_VALUE);
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
	}

}
