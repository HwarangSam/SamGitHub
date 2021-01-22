package day_22_oop_encapsulation;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount ilham = new BankAccount("Ilham","TechCircle");  //when calling constructor use ()
		ilham.setaccountHolder("Ilham TechCircle");
		ilham.setAccountNumber(12345);
		ilham.deposit(10000);
		ilham.availableBalance();	//10000
		
		ilham.withdraw(99);
		ilham.withdraw(1500);
		ilham.availableBalance();  //8401
		
		ilham.deposit(20000);
		ilham.availableBalance();  //28401
		
		
		
	}

}
