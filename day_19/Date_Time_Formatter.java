package day_19;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yyyy, EEEE");
		DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE,hh:mm:ss a, M/dd/yyyy");
		
		System.out.println(date.format(df)); //date and day of week
		
		LocalTime time = LocalTime.now();
		LocalDateTime time2 = LocalDateTime.now();  //for the dtf lol
		
		System.out.println(time);		//military time with hours,min,sec
		System.out.println(time.format(tf)); //am/pm hour and min only (clean)
		System.out.println(time2.format(dtf));  //		Date date1 = new Date();

		LocalTime time3 = LocalTime.of(20, 0, 0);		//8pm
		System.out.println(time3.format(tf));		//8:00pm since tf is hh:mm a

	
	}

}
