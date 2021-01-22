package homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDatesBeforeSomeDate {

	public static void main(String[] args) {
		
		LocalDate DOB [] = new LocalDate[5];
		DOB[0] = LocalDate.of(1985, 12, 03);
		DOB[1] = LocalDate.of(1983, 11, 22);
		DOB[2] = LocalDate.of(1995, 05, 03);
		DOB[3] = LocalDate.of(1990, 04, 06);
		DOB[4] = LocalDate.of(1993, 10, 16);
		
		ArrayList <LocalDate> dateList = new ArrayList<>(Arrays.asList(DOB));
		
		dateList.removeIf(d -> d.isBefore(LocalDate.of(1990, 01, 01)));
		System.out.println(dateList);

	}

}
