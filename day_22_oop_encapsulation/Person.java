package day_22_oop_encapsulation;

import java.time.LocalDate;

public class Person {

	//name, DOB, gender, age, 
	//create parameterized constructor for person class with all fields
	
	private String name;
	private LocalDate DOB;
	private char gender;
	private int age;
		
	//Right click, source, generate constructor using fields and then BAM. We ommited age though
	public Person(String name, LocalDate dOB, char gender) {
		super();
		this.name = name;
		DOB = dOB;
		this.gender = gender;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return LocalDate.now().getYear() - this.DOB.getYear();  //Calculate Age by using DOB and LocalDate.now.getYear()
	}
	public void setAge(int age) {
		this.age = age;
	}

	
}
