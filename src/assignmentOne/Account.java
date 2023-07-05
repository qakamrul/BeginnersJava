package assignmentOne;

public class Account {

	private int id;
	private String name;
	private double balance = 0;
	
	public Account() {
		//This is default constructor
		System.out.println("This is Default Constructor!");
	}
	
	//This is a parameterized constructor
	public Account(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//Getter, Setter NOT added as not using in this project
	
	@Override
	public String toString() {
		return "User Id: " + id + "\nAccount Name: " + name + "\nAccount Balance: " + balance + " BDT";
	}
	
	//Account Check Method
	void AccountCheck(String accName) {
		
		if(accName.contains("Current") || accName.contains("current")) {
			this.balance = 500;
		}
		else {
			this.balance = 100;
		}
		
	}
	
	//Deposit Method
	void DepositBalance(double depositAmount) {
		
		this.balance += depositAmount;
	}
	
	//Withdrawal Method
	void WithdrawBalance(double withdrawAmount) {
		
		if(this.balance > 1000) {
			
			this.balance -= withdrawAmount;
			
			System.out.println("\nAfter withdraw "+ withdrawAmount + " BDT your current account information is: ");
			System.out.println("-------------------------------------------------------------");
			System.out.println(toString());
		}
		else {
			System.out.println("\nW A R N I N G !\n***************\nYou can't withdraw when your current account balance is below: 1000 BDT");
		}
	}
	
}
