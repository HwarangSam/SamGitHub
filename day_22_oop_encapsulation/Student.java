package day_22_oop_encapsulation;

import java.time.LocalDate;

public class Student {

	private String name;	//private makes it invisible outside of this class. So we need to set getter and setter
	private String ID;		//get is to get and set is to update
	private LocalDate DOB;
	private String phoneNumber;
	private String email;
	private char gender;
	private int age;
	
	//getter and setter to all the instance variables
	
	public String getName() {  //GETTER
		return this.name;
	}
	
	public void setName(String str) {
		this.name = str;
	}
	
	
	public Student() {
		System.out.println("Calling student's default constructor");
	} // Default constructor //purpose of constructor is to create the object(?)

	public Student(String name, String ID, LocalDate DOB, String phoneNumber, String email, char gender) {
		//this.name is pointed to your instance variable
		// = name is pointed to your parameter
		this.name = name;
		this.ID = ID;
		this.DOB = DOB;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.gender = gender;
		this.age = LocalDate.now().getYear() - DOB.getYear();
		
	}

	public void getInfo() {
		System.out.println("Name : " + name + " \nId : " + ID + "\n DOB : " + DOB + "\nPhone Number : " + phoneNumber
				+ "\nEmail : " + email + "\nGender : " + gender + "\nAge : " + age);
	}

	public void study() {
		System.out.println(name + " learning Java");
	}

}