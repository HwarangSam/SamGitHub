package day_10;

public class SalaryCalculation {

	public static void main(String[] args) {
		
		int salary = 100000;
		double stateTaxRate = 0.08;
		double federalTaxRate = 0.21;
		double stateTax = salary * stateTaxRate;
		double federalTax = salary * federalTaxRate;
		double totalTax = stateTax + federalTax;
		double salaryAfterTax = salary - totalTax;
		
System.out.println("Your salary is " + salary 
		+ "\nYour state tax is " + stateTax
		+ "\nYour federal tax is " + federalTax
		+ "\nYour total tax is " + totalTax
		+ "\nYour salary after tax is " + salaryAfterTax);

	}

}
