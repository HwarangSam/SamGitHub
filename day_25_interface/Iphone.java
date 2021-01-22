package day_25_interface;

public class Iphone implements Alarm {
	
	public void call() {
		System.out.println("Calling someone");
	}
	public void attendingZoomMeeting() {
		System.out.println("Attending Zoom Meeting");
	}
	public void setAlarm () {
		System.out.println("Setting alarm");
	}
	public void playGame() {
		System.out.println("Playing game");
	}
}
