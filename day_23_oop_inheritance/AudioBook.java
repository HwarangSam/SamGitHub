package day_23_oop_inheritance;

public class AudioBook extends EBook {		//extending EBook will include everything from Book as well

	String type;
	
	public void listenBook() {
		System.out.println("Listening to " + title);   //title variable doesn't exist in this class but it is 
	}												   //inherited so we can use it
	
}
