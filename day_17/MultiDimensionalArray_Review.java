package day_17;

import java.util.Arrays;

public class MultiDimensionalArray_Review {

	public static void main(String[] args) {
	
		String devTeam[] = {"David", "Mike", "Phalgun", "Vijaya"};
		String devTester[] = {"Joe", "Olivia"};
		String uatTester[] = {"Tom", "Shawn"};		
//		CAT
//		FQT	
		String scrumMaster[] = {"Renee"};
		String BA[] = {"Angie", "Matthew"};		//business analyst
		String PO[] = {"Francis", "Ananya"};
				
		String scrumTeam[][] = {devTeam, devTester, uatTester, scrumMaster, BA, PO};
		
////FIND TOTAL NUMBER OF MEMBERS
//		
//		int totalTeamMembers = 0;
//		
//		for (int i = 0; i < scrumTeam.length; i++) {
////			System.out.println(Arrays.toString(scrumTeam[i]));		//printed all names	
//			totalTeamMembers += scrumTeam[i].length;		//+= means adds and then assigns
//		}
//		System.out.println(totalTeamMembers);
//		
//		//PRINT OUT ONLY ANGIE
//		System.out.println(scrumTeam[4][0]);
//		//PRINT RENEE
//		System.out.println(scrumTeam[3][0]);
		
		//NEW TASK
//		
//		for (int i = 0; i <scrumTeam.length; i++) {				//ARRAY 1
//			System.out.println(Arrays.toString(scrumTeam[i]));	//this will loop through all members. Leave blank to bypass and access
//		}														//other layers of array
//		for (int j = 0; j < devTeam.length; j++) {				//ARRAY 2
//			System.out.println(devTeam[j]);						//this will loop within the main array. We chose devteam
//		}
		
		for (int i = 0; i < scrumTeam.length; i++) {				//refers to first ARRAY
//			System.out.println(Arrays.toString(scrumTeam[i]));	
																
		for (int j = 0; j < scrumTeam[i].length; j++) {				//refers to seconds ARRAY
			System.out.println("scrumTeam["+i+"]"+"["+j+"]"+scrumTeam[i][j]);					
		}						
		}	//'i' is index of FIRST ARRAY which is outer loop and 'j' is index of SECOND ARRAY which is inner loop (teams - names)
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
