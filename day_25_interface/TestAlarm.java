package day_25_interface;

public class TestAlarm {

	public static void main(String[] args) {
		
//		Iphone iphone = new Iphone();
//		iphone.attendingZoomMeeting();
//		iphone.call();
//		iphone.setAlarm();
//		
//		Alexa alexa = new Alexa();
//		alexa.alexaWhatTimeIsIt();
//		alexa.setAlarm();
//		
//		Clock clock = new Clock();
//		clock.showCurrentTime();
//		clock.setAlarm();

		
//		Alarm alarm = new Iphone();
//		alarm.setAlarm();
//		
//		Alarm alexa = new Alexa();
//		alexa.setAlarm();
//		
//		Alarm techCircle = new Clock();
//		techCircle.setAlarm();
		
//		TestAlarm ta = new TestAlarm();		//idk wtf
//		ta.testingAlarm(new Iphone());
		
		testingAlarm(new Iphone());
		testingAlarm(new Alexa());
		testingAlarm(new Clock());
	}
	
		private static void testingAlarm(Alarm a) {
			a.setAlarm();
		}
	
	
//polymorphism?
//	private void testingAlarm(Iphone a) {
//		a.setAlarm();
//	}
//	private void testingAlarm(Alexa a) {
//		a.setAlarm();
//}
//	private void testingAlarm(Clock a) {
//		a.setAlarm();
//}
}