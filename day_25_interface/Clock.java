package day_25_interface;

import java.time.LocalDateTime;

public class Clock implements Alarm {

	public void showCurrentTime() {
		System.out.println(LocalDateTime.now());
	}
	public void setAlarm() {
		System.out.println("Clock: Setting alarm at 6AM");
	}
}
