package Assignment12;
import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		
		//This program will take 2 numbers from user
		//Between these 2 numbers it will sum all the odd numbers only
		
		System.out.print("Please enter 2 numbers: ");
		Scanner input = new Scanner (System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int startNum = num1;
		
		//If starting number is Even, then 1 will be added
		if (num1 % 2 == 0) {
			num1++;
		}
		
		int sum = 0;
		for (int i = num1 ; i <= num2; i+=2) {
			
			sum += i;
		}
		System.out.println("Sum of all odd number between " + startNum + " and " + num2 + " is: " + sum);
		input.close();
	}
}
