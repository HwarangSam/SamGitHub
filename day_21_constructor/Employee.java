package day_21_constructor;

import java.time.LocalDate;

public class Employee {

	String name;		//instance variables outside of all methods. Can be accessed by all methods in the class
	double salary;
	char gender;
	LocalDate hireDate;
	String title;
	
	
	public Employee () {}		//default constructor
	public Employee (String name, String title, double salary, char gender, LocalDate hireDate) { //parameterizes constructor
		this.name = name;
		this.title = title;
		this.salary = salary;
		this.gender = gender;
		this.hireDate = hireDate;
	}
	
	public void working () {
		System.out.println(name + " is working");
	}
	
	public void meeting() {
		System.out.println(name + " is in a meeting");
	}
	
	public void coding () {
		System.out.println(name + " is coding");
	}
	
	public void getInfo() {
		
		System.out.println("Name: " + name);
		System.out.println("Title: " + title);
		System.out.println("Salary: " + salary);
		System.out.println("Gender: " + gender);
		System.out.println("Hire Date: " + hireDate);
	}
}
