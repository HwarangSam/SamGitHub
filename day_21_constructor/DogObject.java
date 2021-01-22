package day_21_constructor;
import java.time.LocalDate;

import day_18.Calculater;
public class DogObject {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		
//		Car car1 = new Car();
//		
//		Calculator calculator1 = new Calculator();
//		
//		calculator1.add2Numbers(2, 5);

		dog1.setInfo("Tony", "Mastiff", "Large", 'M', "Black", LocalDate.of(2017, 5, 23));
	
//		dog1.getInfo();	
//		
//		dog1.eat();
//		dog1.drink();
		
		Dog dog2 = new Dog();
		dog2.setInfo("Boof", "Samoyed", "Large", 'F', "White", LocalDate.of(2016, 2, 20));
		
		Dog dog3 = new Dog();
		dog3.setInfo("Diablo", "Chihuahua", "Small", 'F', "Tan", LocalDate.of(2020, 3, 7));
		
		
		Dog dogs[] = {dog1, dog2, dog3};
		
//		for (int i = 0; i < dogs.length; i++) {
//			System.out.println(dogs[i].nickName);
//			System.out.println(dogs[i].age);
//			dogs[i].eat();
//		}
		
		int oldest = dogs[0].age;
		
		for (int i = 0; i < dogs.length; i++) {
			int currentAge = dogs[i].age;
			if( currentAge > oldest) {
				oldest = currentAge;
				
				System.out.println("The oldest age is " + currentAge);
			}
		}
		for (int i = 0; i < dogs.length; i++) {
			if(dogs[i].age == oldest) {
				dogs[i].getInfo();
			}
		}
		
	}
}
