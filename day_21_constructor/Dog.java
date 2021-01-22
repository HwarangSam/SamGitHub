package day_21_constructor;

import java.time.LocalDate;

public class Dog {

	//Instance Variable. These are INSTANCE variables and are outside of all methods and can be used by all methods
	
	String nickName;
	String breed;
	String size;
	char gender;
	String color;
	LocalDate DOB;
	int age;
	
	//Instance Method
	
					//set parameters	//all these are LOCAL variables to this method  //they already exist above
	public void setInfo(String dogName, String dogBreed, String dogSize, char dogGender, String dogColor, LocalDate dogDOB) {
		
		nickName = dogName;
		breed = dogBreed;
		size = dogSize;
		gender = dogGender;
		color = dogColor;
		DOB = dogDOB;
		age = LocalDate.now().getYear() - dogDOB.getYear();
	}
	
	public void getInfo() {
		
		System.out.println("nickName: " + nickName);
		System.out.println("breed: " + breed);
		System.out.println("Dog Size: " + size);
		System.out.println("Dog Gender: " + gender);
		System.out.println("Dog Color: " + color);
		System.out.println("Dog DOB: " + DOB);
		System.out.println("Dog age: " + age);
	}
	
	public void eat() {
		System.out.println(nickName + " is eating food");
	}
	
	public void drink() {
		System.out.println(nickName + " is drinking water");
	}
	
	
	
	
}

