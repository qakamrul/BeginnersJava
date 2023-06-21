package begineerJava;
import java.util.Scanner;

public class SumOfAllOddNumbers {

	public static void main(String[] args) {
		
		//Sum of all Even numbers from user input Start & End
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter Second Number: ");
		int num2 = input.nextInt();
		
		int evenSum = 0;
		
		for (int i = num1; i <= num2; i++) {
			
			if(i % 2 == 0) {
				evenSum += i;
				System.out.print(i + ", ");
			}
		}
		System.out.println("\nSum of all Even numbers: " + evenSum);
		input.close();
	}
}
