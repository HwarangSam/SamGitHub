package day_10;

public class If_Else_2 {

	public static void main(String[] args) {
		/*//CLOCKWORK 
		
		int currentTime = 26;
		
		String amOrPm;
		if (currentTime >12)
			amOrPm = "PM";
			else
				amOrPm = "AM";
		
		if (currentTime > 12)
			currentTime -=12;
		
		
			System.out.println("The current time is " + currentTime + amOrPm);
			
		//ANOTHER PRACTICE: GRADING
		
		int score = 80;
		
		if (score >= 70) { 		//multiple 'if' statements require {}
			System.out.println("You Passed Homie");
			System.out.print("You got a C");
		}else
			System.out.println("You Failed Dawg");
	
		
		NEW OBJECTIVE
		0<grade<100
		
		A = 90 - 100
		B = 80 - 89
		C = 70 - 79
		D = 60 - 69
		E = 0 - 59
		
		
		int score = 100;
		char grade;
		
		if (score >= 0 && score <= 100) {
		
		if( score >=90 && score <=100) {
			grade = 'A';
			System.out.println("Your score is " +score );
			System.out.println("Your grade is " +grade );
			}
	
		if( score >=80 && score <=89) {
			grade = 'B';
			System.out.println("Your score is " +score );
			System.out.println("Your grade is " +grade );
		}
		
		if( score >=70 && score <=79) {
			grade = 'C';
			System.out.println("Your score is " +score );
			System.out.println("Your grade is " +grade );
		}
		
		if( score >=60 && score <=69) {
			grade = 'D';
				System.out.println("Your score is " +score );
				System.out.println("Your grade is " +grade );
		}
		
		if( score >=0 && score <=59) {
			grade = 'E';
			System.out.println("Your score is " +score );
			System.out.println("Your grade is " +grade );
			}
		}else {
			System.out.println("Invalid score");
			}
*/		
		
		int number = 200;
		
		if (number >=0) {
			System.out.println(number + " is positive number: true");
		}
		
		if (number < 0 == false) { //wait what..
			System.out.println(number + " is negative number: false");
		}
	
		if (number != 0) {
			System.out.println(number + " is zero: false");
		}
		
	}

}
