package ArrayPackage;

import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		
		//INT ARRAY SORTING: Ascending and Descending
		
		int[] numbers = {8, -3, 23, 6, 18};
		
		Arrays.sort(numbers);
		
		//Print in Ascending Order
		System.out.print("Ascending Order: ");
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.print(numbers[i] + ", ");
		}
		
		//Print in Descending Order
		System.out.print("\nDescending Order: ");
		for (int i = 4; i >= 0; i--) {
			
			System.out.print(numbers[i] + ", ");
		}
		
		//STRING ARRAY SORTING: Ascending and Descending
		
		String[] names = {"Kamrul", "Rokhsana", "Fatima", "Suraiya", "Muhammad"};
		
		Arrays.sort(names);
		
		//Print in Ascending Order
		System.out.print("\n\nAscending Order: ");
		for (int i = 0; i < names.length; i++) {
			
			System.out.print(names[i] + ", ");
		}
		
		//Print in Descending Order
		System.out.print("\nDecending Order: ");
		for (int i = names.length-1; i >= 0; i--) {
			
			System.out.print(names[i] + ", ");
		}
	}
}
