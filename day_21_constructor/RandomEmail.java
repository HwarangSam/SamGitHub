package day_21_constructor;

import java.util.Random;

public class RandomEmail {

	public static void main(String[] args) {
		
	}

	public static String randomEmail () {
		String names[] = {"Irfan","Kanin","Shafkat", "Sam", "Andrew", "Nasir", "Beneesh", "LJ", "Ilham", "Sayed"};
		
		String domains[] = {"gmail","techcircle", "yahoo", "hotmail", "outlook", "amazon", "oracle", "walmart"};
		
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		sb.append(names[random.nextInt(names.length-1)]);
		sb.append("@");
		sb.append(domains[random.nextInt(domains.length-1)]);
		sb.append(".com");
//		System.out.println(sb.toString());
		return sb.toString();  	
		
		
//		System.out.println(random.nextInt(50));
//		System.out.println(random.nextInt(names.length-1));
		
//		System.out.println(names[random.nextInt(names.length-1)]);		//chooses name randomly
//		System.out.println(domains[random.nextInt(domains.length-1)]);	//chooses domain randomly
		
	}

}
