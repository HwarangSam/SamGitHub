package day_19;

public class Password_Validation {

	public static void main(String[] args) {
		
		//must contain 8-20 char
		//and 2 of the following: lowercase, uppercase, numbers, special char except < > * /
		
		String password = "Password@1";
		
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasNumber = false;
		boolean hasSpecialChar = false;
		
		String notValidChar = "<>*/";
		
		if(password.length() >= 8 && password.length() < 21) {
			
		if (checkIfCharExist(password, '<') == -1
				&& checkIfCharExist(password, '>') == -1
				&& checkIfCharExist(password, '*') == -1
				&& checkIfCharExist(password, '/') == -1)
			for (int i = 0; i < password.length(); i++) {
				char oneChar = password.charAt(i);
				
				if(Character.isUpperCase(oneChar)) {
					hasUpperCase = true;
				}
				if(Character.isLowerCase(oneChar)) {
					hasLowerCase = true;
				}
				if(Character.isDigit(oneChar)) {
					hasNumber = true;
				}
				if(!Character.isLetterOrDigit(oneChar)) {
					hasSpecialChar = true;
				}else {
					System.out.println("Your password contains an invalid character");
				}
			}
		}else {
			System.out.println("Password is not correct size");
		}
		
		if (hasUpperCase && hasLowerCase && hasNumber && hasSpecialChar ) {
			System.out.println("Valid password");
		}else {
			System.out.println("Invalid password");
		}
	}
		
		public static int checkIfCharExist(String str, char targetChar){
			
			return str.indexOf(Character.toString(targetChar));
		}

}
