package begineerJava;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive Number: ");
		int num = input.nextInt();
		input.close();
		
		int sum = 0;
		int temp = num;
		
		while(temp != 0) {
			
			int r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;
		}
		System.out.println("Reverse of the given Number: " + sum);
	}
}
