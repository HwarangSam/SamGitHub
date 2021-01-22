package day_22_oop_encapsulation;

public class StudentObject {

	public static void main(String[] args) {
		
		Student s1 = new Student(); 		// "calling student's default constructor"
//		System.out.println(s1.age);		//accessed instance variable
//		System.out.println(s1.email);
//		System.out.println(s1.ID);
//		System.out.println(s1.name);
		
		s1.setName("techCircle");
		System.out.println(s1.getName());
		
		s1.study();		//called study method for s1 object
		s1.getInfo();
		
	}

}
