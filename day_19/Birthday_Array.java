package day_19;

import java.time.LocalDate;
import java.time.Month;

public class Birthday_Array {

	public static void main(String[] args) {
		
		String names[] = {"Kanin", "Park", "Shawn", "Sim", "Nobel"};
		LocalDate birthdays[] = new LocalDate[names.length];
		
		birthdays[0] = LocalDate.of(1988, 5, 24);
		birthdays[1] = LocalDate.of(1990, 11, 24);
		birthdays[2] = LocalDate.of(1991, 5, 24);
		birthdays[3] = LocalDate.of(1992, 12, 1);
		birthdays[4] = LocalDate.of(1989, 4, 24);
		
		for (int i = 0; i < birthdays.length; i++) {
			Month month = birthdays[i].getMonth();
			int day = birthdays[i].getDayOfMonth();
			
			if(LocalDate.now().getMonth().equals(month) && 
					LocalDate.now().getDayOfMonth() == day){
				
				System.out.println("Happy Birthday " + names[i] + "!!");
				System.out.println(birthdays[i].atTime(13, 26, 58));   //for time stamp
			}
		}
		
		
		
		
		
		
	}
}
