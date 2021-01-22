package day_27_exceptions;

import java.io.File;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) {
		try {			//hover and surround with try/catch
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 

		
		File file = new File("file location");
		
		try {
		FileReader fr = new FileReader(file); 
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
