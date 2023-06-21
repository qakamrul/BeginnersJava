package ArrayPackage;

public class Array7 {

	public static void main(String[] args) {
		
		int[][] number = new int[4][5];
		int k = 0;
		
		//Insert array values
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				number[i][j] = k;
				k++;
			}
		}
		//Print the array
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				System.out.print(number[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
