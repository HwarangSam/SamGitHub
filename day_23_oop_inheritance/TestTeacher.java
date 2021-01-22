package day_23_oop_inheritance;

public class TestTeacher {

	public static void main(String[] args) {	
		
//		PhysicsTeacher pt = new PhysicsTeacher();	//physicsTeacher has method of PhysicsTeacher but also
//													//since in that method we inherited Teacher class we can access that too
//		
//		System.out.println(pt.collegeName);
//		System.out.println(pt.designation);
//		pt.does();
//		System.out.println(pt.mainSubject);
		
		
		JavaExample AE = new JavaExample();		//inheritance can extend to several classes
		
//		System.out.println(AE.collegeName);  //George Mason
//		System.out.println(AE.designation);	 //Teacher
//		AE.does();							 //is teaching
		
		AE.learningJavaSuper();
	}
}
