package ArrayPackage;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {

		// Take 5 number of User in Array
		// Print sum of this array
		// Print average of this array

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 5 numbers: ");

		double[] num = new double[5];
		double sum = 0;
		double avg = 0;

		for (int i = 0; i < num.length; i++) {

			num[i] = input.nextDouble();
			sum = sum + num[i];
		}
		avg = sum / num.length;

		System.out.println("Sum of this array is: " + sum);
		System.out.println("Average of this array is: " + avg);
		
		//Find the Maximum & Minimum value from the array
		
		double max = num[0];
		double min = num[0];
		
		for(int i = 1; i < num.length; i++) {
			
			if(max < num[i]) {
				
				max = num[i];
			}
			if(min > num[i]) {
				
				min = num[i];
			}
		}
		
		System.out.println("Maximum number in this array: " + max);
		System.out.println("Minimum number in this array: " + min);

		input.close();
	}
}
