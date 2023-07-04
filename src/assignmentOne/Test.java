package assignmentOne;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		//Taking input from user
		Scanner input = new Scanner(System.in);
		int userID = 0;
		String userName;
		double accBalance = 0;
		
		System.out.print("Please Enter your ID: ");
		userID = input.nextInt();
		
		System.out.print("Please Enter your Name: ");
		userName = input.next();
		
		System.out.print("Please Enter Account Balance: "); 
		accBalance = input.nextDouble();
		
		
		//Create the Object of Account class
		Account account = new Account(userID, userName, accBalance);
		
		System.out.println("\nYour Account Information is as below: ");
		System.out.println("-------------------------------------");
		System.out.println(account);
		
		//Take input for Deposit amount
		System.out.print("\nPlease Enter the amount you want to Deposit: ");
		double depAmount = input.nextDouble();
		
		account.DepositBalance(depAmount);
		System.out.println("\nAfter Deposit your current account information is: ");
		System.out.println("--------------------------------------------------");
		System.out.println(account);
		
		//Take input for Withdrawal
		System.out.print("\nPlease Enter Withdrawal Amount: ");
		double withdrawAmount = input.nextDouble();
		
		account.WithdrawBalance(withdrawAmount);
		input.close();
	}
}
