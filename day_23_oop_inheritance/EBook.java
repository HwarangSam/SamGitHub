package day_23_oop_inheritance;

public class EBook extends Book{

//	String title;  **Instead of having duplicate instance variables we can just extend a parent class that has the same
//	String author;
//	double price;

	String size;
	int page;
	
	public void readBook() {
		System.out.println("Reading " + title);
	}
	
	//CREATED CONSTRUCTOR with inherited Book Class
	public EBook() {}
	public EBook(String title, String author, double price) {
		super(title, author, price);			//with "super" use () to call from superclass
	}											//i guess instead of writing it again?
	public EBook(String title, String author, double price, String size, int page) {
		super(title, author, price);	
		this.size = size;
		this.page = page;
	}											
	
}
