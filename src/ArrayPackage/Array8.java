package ArrayPackage;

public class Array8 {

	public static void main(String[] args) {
		
		int[][] num = new int[4][]; //Declare only row number, not column
		
		//Declare different column value for different rows
		num[0] = new int[1]; //For row = 0, column = 1
		num[1] = new int[2]; //for row = 1, column = 2
		num[2] = new int[3];
		num[3] = new int[4];
		
		int k = 0;
		for(int row = 0; row < 4; row++) {
			
			for(int col = 0; col < row+1; col++) {
				
				num[row][col] = k;
				k++;
			}
		}
		
		//Print the Matrix/Array
		for(int row = 0; row < 4; row++) {
			
			for(int col = 0; col < row+1; col++) {
				
				System.out.print(num[row][col] + "  ");
			}
			System.out.println();
		}
	}
}
