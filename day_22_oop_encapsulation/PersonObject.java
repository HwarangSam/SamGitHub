package day_22_oop_encapsulation;

import java.time.LocalDate;

public class PersonObject {

	public static void main(String[] args) {
		
		Person p1 = new Person("Nobel", LocalDate.of(1990, 5, 21), 'M');
		
		System.out.println(p1.getAge());
		System.out.println(p1.getGender());
		System.out.println(p1.getName());
		//update DOB
		p1.setDOB(LocalDate.of(1995, 8, 18));
		System.out.println(p1.getAge());
	
	}

}
