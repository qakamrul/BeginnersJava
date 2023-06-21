package begineerJava;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int num = input.nextInt();
		input.close();
		
		int sum = 0;
		int temp = num;
		
		while(temp != 0) {
			
			int r = temp % 10;
			sum = sum + r;
			temp = temp / 10;
		}
		
		System.out.println("\nSUM of " + num + " digits: " + sum);
	}
}
