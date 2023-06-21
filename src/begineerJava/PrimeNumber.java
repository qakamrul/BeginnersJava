package begineerJava;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any Positive Integer Number: ");
		int num = input.nextInt();
		int count = 0;
		
		if(num == 0 || num == 1) {
			System.out.println(num + " : Not a Prime Number");
		}else {
			for(int i = 2; i < num/2; i++) {
				
				if(num % i == 0) {
					count++;
					break;
				}
			}
			if(count == 0) {
				System.out.println(num + " : A Prime Number");
			}
			else {
				System.out.println(num + " : Not a Prime Number");
			}
		}	
		input.close();
	}
}
