package Assignment11;
import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		//Find the factorial number
		
		System.out.print("Please enter an Integer Number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int fact = 1;
		for (int i = 1; i<= num; i++) {
			
			fact *= i;
		}
		
		System.out.println("Factorial of " + num + ": " + fact);
		input.close();
	}
}
