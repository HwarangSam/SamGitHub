package day_22_oop_encapsulation;

public class LoginTest {

	public static void main(String[] args) {
		
		Credentials loginInfo = new Credentials();
		
		System.out.println("Enter your user name");
		System.out.println(loginInfo.getUserName());  //type your variable name.get to get info from contructor?
		
		System.out.println("Enter your password");
		System.out.println(loginInfo.getPassword());

		System.out.println("Press submit button");
	}

}
