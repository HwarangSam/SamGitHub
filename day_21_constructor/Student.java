package day_21_constructor;

import java.time.LocalDate;

public class Student {

	String name;
	String ID;
	LocalDate DOB;
	String phoneNumber;
	String email;
	char gender;
	int age;

	public Student() {
		System.out.println("Calling student's default constructor");
	} // Default constructor

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
