package day_22_oop_encapsulation;

public class BankAccount {
	/*
	create a custom class called BankAccount for Bank of America
	a.  public variables:  bankName, firstName, lastName
	b.  private variables: accountHolder, accountNumber, balance
	c.  encapsulate all the private data
	*/
	
	final static String bankName = "PNC";  //what does static do?
	public String firstName;
	public String lastName;
	
	private String accountHolder;
	private int accountNumber;
	private double balance;
	
	//encapsulate
	//right click = source = generate getters and setters
	
	public String getaccountHolder() {
		return this.accountHolder;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setaccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	//d. create a constructor that can initialize firstName and lastName
	
	public BankAccount() {}
	
	public BankAccount(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//e. public methods:
//	deposit (apply set Methods)
//	withdraw (apply set Methods)
//	availableBalance (apply getter)
	
	public void deposit(double amount) {
		if(amount < 0) {
			return;		//security measure. You cannot deposit negative money lol
		}
		this.balance = balance+amount;
	}
	public void withdraw (double amount) {
		
		balance = balance - amount; //OR balance -= amount; (substracts amount and the updates to new/updated value)
	}
	
	public void availableBalance() {
		System.out.println("Your account has $" + getBalance());
	}
	
}