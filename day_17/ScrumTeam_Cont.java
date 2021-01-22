package day_17;

import java.util.Arrays;

public class ScrumTeam_Cont {

	public static void main(String[] args) {
		String devTeam[] = {"David", "Mike", "Phalgun", "Vijaya"};
		String devTester[] = {"Joe", "Olivia"};
		String uatTester[] = {"Tom", "Shawn"};		
		String scrumMaster[] = {"Renee"};
		String BA[] = {"Angie", "Matthew"};		//business analyst
		String PO[] = {"Francis", "Ananya"};
				
		String scrumTeam[][] = {devTeam, devTester, uatTester, scrumMaster, BA, PO};
		
		//Find longest name and shortest length
		
//		int max = 0;  
//		
//		for (int i = 0; i < scrumTeam.length; i++) {
//			for (int j = 0; j < scrumTeam[i].length; j++) {	//scrum team i is the team groups. j is the individual name
////				System.out.println(scrumTeam[i][j].length());  //Prints out length of each name
//				
//				if (scrumTeam[i][j].length() > max) {		//if any of the names is longer than "David"
//					max = scrumTeam[i][j].length();			//that becomes the new "max"
//				}
//			}
//		}
//		System.out.println(max);
		
		//Find shortest name
		
		int min = scrumTeam[0][0].length();  
		String name = " ";
		for (int i = 0; i < scrumTeam.length; i++) { //i<scrumteam.length is how many times it loops through, the length of # of teams
			for (int j = 0; j < scrumTeam[i].length; j++) {	
				
				if (scrumTeam[i][j].length() < min) {		//[i][j] refers to looping through inner loop ind.names
					min = scrumTeam[i][j].length();			//if any ind.name is less than the "min" which is David
					name = scrumTeam[i][j];					//then that becomes the new "min" variable and "name" variable
				}
			}
		}
		System.out.println(min);
		System.out.println(name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
