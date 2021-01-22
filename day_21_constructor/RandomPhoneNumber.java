package day_21_constructor;

import java.util.Random;

public class RandomPhoneNumber {

	public static String randomPhone(String areaCode) {
			
		Random rd = new Random();
		StringBuilder sb = new StringBuilder();
		sb.append(areaCode);
		sb.append(rd.nextInt(999));
		sb.append(rd.nextInt(9999));
		
		return sb.toString();
	
		}
	}
