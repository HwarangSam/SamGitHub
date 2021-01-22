package day_21_constructor;

import static day_21_constructor.RandomPhoneNumber.randomPhone;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Arrays;

import day_21_constructor.RandomEmail;

public class StudentObject {

	public static void main(String[] args) {
		
		Student student1 = new Student("Ilham","99",LocalDate.of(1990, 8, 15),
				randomPhone("703"),
				RandomEmail.randomEmail(),
				'M');
//		student1.age = 20;
//		student1.DOB = 
//		student1.getInfo();
//		student1.study();
//		                               String name, String ID, LocalDate DOB, Long phoneNumber, String email, char gender
		
		Student student2 =
				new Student("Kanin","100",LocalDate.of(1995, 8, 15),
						randomPhone("301"),
						RandomEmail.randomEmail(),'M');
		
//		student2.getInfo();
//		student2.study();
		
		
		Student student3 =
				new Student("Park","101",LocalDate.of(1996, 8, 15),
						randomPhone("301"),
						RandomEmail.randomEmail(),
						'M');
		
		
		Student student4 =
				new Student("Gift","102",LocalDate.of(1990, 8, 15),
						randomPhone("202"),
						RandomEmail.randomEmail(),
						'M');
		
		Student student5 =
				new Student("Girly","103",LocalDate.of(1990, 8, 15),
						randomPhone("703"),
						RandomEmail.randomEmail(),
						'F');
		
		
		ArrayList<Student> tmt = new ArrayList<>(Arrays.asList(student1,student2,student3,
				student4,student5));
		
		ArrayList<Student> males = new ArrayList<>(Arrays.asList(student1,student2,student3,
				student4,student5));
		ArrayList<Student> females = new ArrayList<>(Arrays.asList(student1,student2,student3,
				student4,student5));
		
//		for (int i = 0; i < tmt.size(); i++) {
//			char currentGender = tmt.get(i).gender;
//			
//			if(currentGender == 'M') {
//				males.add(tmt.get(i));
//			}else if (currentGender == 'F') {
//				females.add(tmt.get(i));
//			}else {
//				System.out.println("non-binary");
//			}
		
//		tmt.removeIf(p -> p.gender == 'M');
		males.removeIf(m -> m.gender == 'F');
		females.removeIf(f -> f.gender == 'M');

		System.out.println(males.size());
		System.out.println(females.size());
		
			
			
		
	
		
		
	}
}
