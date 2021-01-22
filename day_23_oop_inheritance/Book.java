package day_23_oop_inheritance;

public class Book {

	String title;	//these are our instance variables
	String author;
	double price;
	
	//instance method
	
	public String toString() {		//since there is no void statement we have to return
		return  "Title: " + title + 
				"Author: " + author + 
				"Price: $" + price;
		
	}
	
	//Let's make a CONSTRUCTOR (to create several objects. Default and parameter)
	//default contructor
	public Book() {}
	//paramaterized constructor
	public Book(String bookTitle, String bookAuthor, double bookPrice) {
		
		this.title = bookTitle;		//use "this"to assign instance variables to parameter variables
		this.author = bookAuthor;
		this.price = bookPrice;
				
	}
}
