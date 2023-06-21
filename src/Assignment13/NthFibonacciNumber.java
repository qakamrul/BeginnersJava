package Assignment13;
import java.util.Scanner;

public class NthFibonacciNumber {
	
	public static void main(String[] args) {
		
		//Find the Nth FIBONACCI number from user Input
		//FIBONACCI Series: 0, 1, 1, 2, 3, 5, 8, 13, 21,...
		
		Scanner input = new Scanner(System.in);
		System.out.print("Which FIBONACCI number you want to see? : ");
		int expFibo = input.nextInt();
		input.close();
		
		int num1 = 0;
		int num2 = 1;
		int nextFibo = 0;
		
		if(expFibo == 1) {
			
			System.out.println("\n1st FIBONACCI Number is: " + num1);
			
		}else if(expFibo == 2) {
			
			System.out.println("\n2nd FIBONACCI Number is: " + num2);
			
		}else {
			
			for(int i = 1; i <= expFibo - 2; i++) {
				
				nextFibo = num1 + num2;
				num1 = num2;
				num2 = nextFibo;
				nextFibo = 0;
			}
			
			if (expFibo == 3) {
				
				System.out.println("\n" + expFibo + "rd FIBONACCI Number is: " + num2);
				
			}else {
				
				System.out.println("\n" + expFibo + "th FIBONACCI Number is: " + num2);
			}
		}
	}
}
