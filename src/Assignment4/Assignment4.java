package Assignment4;
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		
		try(Scanner input = new Scanner(System.in)){
			
			int phonePrice = 1800; //1800 Euros
			int numOfInstallment, installmentPerMonth;
			
			System.out.print("Number of Installments? : ");
			
			//Get number of Installments from user
			numOfInstallment = input.nextInt();
				
			//Calculate installment amount for per month
			installmentPerMonth = phonePrice/numOfInstallment;
			System.out.println("Installment amount per month is: " + installmentPerMonth + " Euros");
		}
	}
}
