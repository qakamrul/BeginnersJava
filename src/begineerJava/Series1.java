package begineerJava;
import java.util.Scanner;

public class Series1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n, sum = 0;
		
		System.out.print("Please enter the last number: ");
		n = input.nextInt();
		
		//SERIES: 1 + 2 + 3 + ........ + n
		/*
		for (int i = 1; i <= n; i++) {
			
			sum += i;
			System.out.print(" " + i);
		}
		
		System.out.println("\nSum of this series: " + sum);			
		*/
		
		//SERIES: 1^2 + 2^2 + 3^2 + 4^2 + ........ + n^2
		
		for (int i = 1; i <= n; i++) {
			
			sum += (i*i);
			System.out.print(i + "^" + 2 + " ");
		}
		System.out.println("\nSum of this series: " + sum);
		input.close();	
	}

}
