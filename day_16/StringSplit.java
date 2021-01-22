package day_16;

public class StringSplit {

	public static void main(String[] args) {

			String actual = "BUY USD SELL RMB";
			String expected = "BUY RMB SELL USD";
			
//			String str = "Hello:Irfan:Nobel:Kanin";
//			String arr[] = str.split(":");		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		
//		String arr2[] = actual.split("USD");	//the split point. Where the array will divide its elements
//		System.out.println(arr2[0]);	//BUY
//		System.out.println(arr2[1]);	//SELL RMB
		
		String arr3[] = actual.split(" ");
		
		for (int i = 0; i < arr3.length; i++) {
//			System.out.println(arr3[i]);
		}
		
		String expectedStr = arr3[0].concat(" ")
				.concat(arr3[3]
				.concat(" ")
				.concat(arr3[2]
				.concat(" ")
				.concat(arr3[1])));
//	System.out.println(expectedStr);	
		
		
//		String strNew = actual.replace("USD", "RMB");
//		System.out.println(strNew);  				//BOTH methods work
		
		
		
		//NEW TASK
		String email = "irfan@techcircle.com";
		
		String parts [] = email.split("@");			//Split must be made in ARRAY[]
		System.out.println("name = " + parts[0]);
		String domainName = parts[1];
		System.out.println(domainName.length());
		String domains[] = domainName.split("\\.");  //For some reason . is a special character so we use \\ to override that
		System.out.println("domainName: " + domains[0]);
		
		
		
		
		
		
	}

}
