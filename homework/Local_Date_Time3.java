package homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Local_Date_Time3 {

	public static void main(String[] args) {
//	    3. create an array of string and store 5 of your friends' names
//      create an array of LocalDate and store their DofB
//      find out who is youngest and oldest
		
		String[] names = {"Sam", "Dan", "Anna", "Jess", "Robin"};
		
		LocalDate DOB [] = new LocalDate[5];
		DOB[0] = LocalDate.of(1985, 12, 03);
		DOB[1] = LocalDate.of(1983, 11, 22);
		DOB[2] = LocalDate.of(1995, 05, 03);
		DOB[3] = LocalDate.of(1990, 04, 06);
		DOB[4] = LocalDate.of(1993, 10, 16);
		
		ArrayList <LocalDate> dateList = new ArrayList<>(Arrays.asList(DOB));		//converting array to arrayList
		Collections.sort(dateList);
		
		LocalDate youngest = dateList.get(dateList.size()-1);						//Second Method
		LocalDate oldest = dateList.get(0);
		
		
//		LocalDate smallest = DOB[0];
//		LocalDate largest = DOB[0];
		
//		for (int i = 0; i < DOB.length; i++) {		
//			LocalDate currentDate = DOB[i];
//			if(currentDate.isBefore(largest)) {		//.isBefore is longer ago and .isAfter after a date
//				largest = currentDate;
//			}
//			if (currentDate.isAfter(smallest)) {
//				smallest = currentDate;
//			}
//		}
		
		System.out.println("Youngest DOB is " + youngest);
		System.out.println("Oldest DOB is " + oldest);
		
		for (int i = 0; i < DOB.length; i++) {		//DOB array is not changed. Only ArrayList dateList was sorted by Collections
			LocalDate currentDate = DOB[i];
			if(currentDate == youngest) {
				System.out.println("Your youngest friend is " +names[i] + ", born on " + currentDate);	 //FOR loop is just looping index number
			}
			if(currentDate == oldest) {
			System.out.println("Your oldest friend is " + names[i]+ ", born on " + currentDate);
	}
	}

}
}
