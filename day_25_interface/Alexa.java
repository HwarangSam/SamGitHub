package day_25_interface;

import java.time.LocalDateTime;

public class Alexa implements Alarm{	//implements is to use interfaces

	public void alexaWhatTimeIsIt() {
		System.out.println("It is " + LocalDateTime.now());
	}
	public void setAlarm() {
		System.out.println("Alexa is setting an alarm at 6AM");
	}
}
