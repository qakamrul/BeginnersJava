package ArrayPackage;

public class Array3 {

	public static void main(String[] args) {
		
		//For Each loop
		
		String[] names = {"Kamrul", "Rokhsana", "Fatima", "Suraiya", "Muhammad"};
		
		for(String x : names) {
			
			System.out.println(x);
		}
		
		int[] numbers = {100, 234, 400, 700, 532, 567};
		int sum = 0;
		
		for(int x : numbers) {
			
			sum = sum + x;
		}
		
		System.out.println("\nSum of 2nd array: " + sum);
	}
}
