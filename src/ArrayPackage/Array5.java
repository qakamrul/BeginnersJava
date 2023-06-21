package ArrayPackage;
import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {

		// Take user input for TWO 2 Dimensional Array element
		// Sum each element from those array & put the result in 3rd array
		// Show the result

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st Array Elements: ");

		int[][] A = new int[2][3];
		int[][] B = new int[2][3];
		int[][] sum = new int[2][3];

		// Taking input for Array A[][]
		for (int row = 0; row < 2; row++) {

			for (int col = 0; col < 3; col++) {

				System.out.printf("A[%d][%d] = ", row, col);
				A[row][col] = input.nextInt();
			}
		}

		// Taking input for Array B[][]
		System.out.println("\nEnter 2nd Array Elements: ");

		for (int row = 0; row < 2; row++) {

			for (int col = 0; col < 3; col++) {

				System.out.printf("B[%d][%d] = ", row, col);
				B[row][col] = input.nextInt();
			}
		}

		// Print the values of Array A[][]
		System.out.println("\nElements of Array A[][]: ");
		for (int row = 0; row < 2; row++) {

			for (int col = 0; col < 3; col++) {

				System.out.print(A[row][col] + " ");
			}
			System.out.println("");
		}
		// Print the values of Array B[][]
		System.out.println("\nElements of Array B[][]: ");
		for (int row = 0; row < 2; row++) {

			for (int col = 0; col < 3; col++) {

				System.out.print(B[row][col] + " ");
			}
			System.out.println();
		}
		input.close(); // Close the user input call

		// [][]Sum of each elements of Array A[][] and Array B[][]
		System.out.println("\nSum of each element of Array A[][] & Array B[][] is: ");
		for (int row = 0; row < 2; row++) {

			for (int col = 0; col < 3; col++) {

				sum[row][col] = A[row][col] + B[row][col];
			}
		}

		// Print each element from Array Sum[][]
		for (int row = 0; row < 2; row++) {

			for (int col = 0; col < 3; col++) {

				System.out.print(sum[row][col] + " ");
			}
			System.out.println();
		}
	}
}
