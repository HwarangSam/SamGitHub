package homework;

public class Find_Element_Exist {

	public static void main(String[] args) {
//		Write a Java program to test if an array contains a certain value
//		int[] my_array1 = {
//		1789, 2035, 1899, 1456, 2013,
//		1458, 2458, 1254, 1472, 2365,
//		1456, 2265, 1457, 2456};
//		Check if 2019 and 2013 are contains in above array.
		
		int[] array1 = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456};
		
		boolean boo1 = true;
		boolean boo2 = true;
		int var1 = 2019;
		int var2 = 2013;
		
		for (int i = 0; i < array1.length; i++) {
			if(array1[i] == var1) {
				boo1 = true;
			}else {
				boo1 = false;
			}
			if(array1[i] == var2) {
				boo2 = true;
			}else {
				boo1 = false;
			}
		}
		
if (boo1 == true) {
	System.out.println(var1 + " is found");
}else {
	System.out.println(var1 + " is not found");
}

if (boo2 == true) {
	System.out.println(var2 + " is found");
}else {
	System.out.println(var2 + " is not found");
}	



	}
}
