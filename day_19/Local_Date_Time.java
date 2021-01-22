package day_19;

import java.time.LocalDate;

public class Local_Date_Time {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		LocalDate yesterday = LocalDate.now().minusDays(1);  //to find yesterday etc.
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		LocalDate expirationDate = date.plusDays(7);
		
		System.out.println(date);
		System.out.println(yesterday);
		System.out.println(tomorrow);
		System.out.println(expirationDate);
		
		System.out.println(date.isLeapYear());	//boolean statemtent is it leap year true or false. true
		
		LocalDate lastYear = date.minusYears(1); 	
		System.out.println(lastYear.isLeapYear());	//false
		
		System.out.println(yesterday.isBefore(date)); //true
		System.out.println(tomorrow.isAfter(date)); //true
		System.out.println(date.getDayOfMonth()); //1 since its dec. 1st
		System.out.println(yesterday.getDayOfMonth());  //30
		System.out.println(date.getDayOfMonth()); 		//1
		System.out.println(tomorrow.getDayOfMonth());	//2
		System.out.println(date.getDayOfYear()); 		//it is the 336th day the year
		
		LocalDate date1 = LocalDate.of(1985, 12, 03);
		LocalDate date2 = LocalDate.of(1983, 11, 22);
		
		System.out.println(date1);
		System.out.println(date1.getDayOfWeek());  //TUESDAY I was born on a tuesday lol and so was hyung
		System.out.println(date2.getDayOfWeek());
		
		
		
		
		
		
		
	}
}
