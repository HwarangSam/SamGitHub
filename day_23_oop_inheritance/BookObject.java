package day_23_oop_inheritance;

public class BookObject {

	public static void main(String[] args) {
		
		EBook eInfo = new EBook("Java OCA ", "Katherine ", 32.99, "Large ", 532);
		
		System.out.println(eInfo.toString());  //the .toString is actually the method from BookClass.
		
		System.out.println(eInfo.author);
		System.out.println(eInfo.price);
		System.out.println(eInfo.size);
		System.out.println(eInfo.page);
		
		
		
		
		
		AudioBook audio = new AudioBook();	//Class createdObject = new Class();
		
		audio.title = "The Beatles";	//createdObject. to modify/update/run method
		audio.listenBook();
	}

}
