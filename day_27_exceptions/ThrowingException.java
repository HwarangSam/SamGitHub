package day_27_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowingException {

	public static void main(String[] args) {
		
	
		
		

	}

	public void methodA() throws FileNotFoundException { //this is what was added by throwing
		File file = new File("c:\\someLocation");
		FileReader reader = new FileReader(file); //hover and add throws exception
	}
	
	public void methodB() {  //call methodA but bc it's not static can't call easily
		ThrowingException obj = new ThrowingException(); 	//that's a new one
		try {		//hover and surround with try/catch
			obj.methodA();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void methodC() throws FileNotFoundException {  //we throw and get this
		ThrowingException obj = new ThrowingException(); //need to do this to call methodA..wth
		obj.methodA(); //this time we throw
	}
	
	
}
