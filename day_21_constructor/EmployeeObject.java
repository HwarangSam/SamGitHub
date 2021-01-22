package day_21_constructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObject {

	public static void main(String[] args) {
		//create 5 employees and filter/find highest salary
		
		Employee employee1 = new Employee("LJ","SDET",120000,'M', LocalDate.of(2021, 04, 15));
		Employee employee2 = new Employee("Sam","QA", 90000, 'M', LocalDate.of(2021, 04, 20));
		Employee employee3 = new Employee("Greg", "Intern", 50000, 'M', LocalDate.of(2021, 8, 03));
		Employee employee4 = new Employee("Gale", "Janitor", 35000, 'F', LocalDate.of(2021, 1, 07));
		Employee employee5 = new Employee("Gwen", "Scrum Master", 120000, 'F', LocalDate.of(2021, 11, 19));
		
		ArrayList<Employee> employeeSalary = new ArrayList<>(Arrays.asList(employee1, employee2,employee3,employee4,employee5));
		
		
	}

}
