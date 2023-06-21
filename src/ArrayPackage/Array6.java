package ArrayPackage;
import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		
		//Sum of Diagonal, Upper Triangle & Lower Triangle from a 2D Matrix
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter elements of Matrix: ");
		
		int[][] A = new int[3][3];
		int diagSum = 0;
		int uppSum = 0;
		int lowSum = 0;
		
		//Taking input for Array A[][]
		for(int row = 0; row < 3; row++) {
			
			for(int col = 0; col <3; col++) {
				
				System.out.printf("A[%d][%d] = ",row,col);
				A[row][col] = input.nextInt();
			}
		}
		input.close(); //Close the user input call
		
		//Show the elements of the Array A[][]
		System.out.println("\nElements of Matrix: ");
		
		for(int row = 0; row <3; row++) {
			
			for(int col = 0; col < 3; col++) {
				
				System.out.print(A[row][col] + "  ");
			}
			System.out.println("\n");
		}
		
		//Summation of DIAGONAL [0][0] + [1][1] + [2][2] Elements
		for(int row = 0; row < 3; row++) {
			
			for(int col = 0; col < 3; col++) {
				
				if(row == col) {
					
					diagSum = diagSum + A[row][col];
				}
				
				if (row < col) {
					
					//System.out.println(A[row][col]);
					uppSum = uppSum + A[row][col];
				}
				
				if (row > col) {
					
					//System.out.println(A[row][col]);
					lowSum = lowSum + A[row][col];
				}
			}
		}
		System.out.println("Sum of Diagonal values: " + diagSum);
		System.out.println("Sum of Upper Triangle: " + uppSum);
		System.out.println("Sum of Lower Triangle: " + lowSum);
	}
}
