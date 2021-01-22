package day_23_oop_inheritance;

public class JavaExample extends Teacher {

	public void learningJavaSuper() {
		super.collegeName = "TECHCIRCLE";	//super refers to our superclass which is "Teacher" Class and updated
		System.out.println(super.collegeName);
		System.out.println(super.designation);
		super.does();
		
	}
	
}
