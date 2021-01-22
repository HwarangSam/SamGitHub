package day_16;

public class For_Each_Loop2 {

	public static void main(String[] args) {
		
		String names[] = {"Kanin","Park", "Shawn", "Ilham", "Sam", "Sim", "Dilnaz"};
		
		for (int i = 0; i <names.length; i++) {
//TASK 1
			
			
//			if (names[i].length() < 4) {
//				System.out.println(names[i]);
//			}
			
			
			//TASK 2 & 3
			
			
			char charArr[] = names[i].toCharArray();   //converting each name to a char array
			
			for (int j = 0; j < charArr.length; j++) {
//				if (charArr[j] == 'w' || charArr[j] == 'z') {
//					System.out.println(names[i]);           //print whole name which is from array i not charArray j
//				}
			}
			
			//FIND THE LAST CHARACTER OF EACH ELEMENT
			
			
			String currentName = names[i];
			int lastIndex = names[i].length()-1;	//reffering to index number is INT not String	
			
//			System.out.println(currentName.charAt(lastIndex));
			
			//OR
			
//			System.out.println(names[i].charAt(names[i].length()-1));
			
			char lastChar = currentName.charAt(lastIndex);
//		
//			if (lastChar == 'm') {
//				System.out.println(currentName);
//			}
			
			
			//OR
			
			
//			if (currentName.endsWith("m")) {
//				System.out.println(currentName);
//			}
			
			
			//PRINT LAST TWO CHAR OF EACH NAME
			
			System.out.println(currentName.substring(currentName.length()-2));
			
			
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
