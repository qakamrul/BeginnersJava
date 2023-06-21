package ArrayPackage;

public class Array1 {

	public static void main(String[] args) {
		
		int[] number = new int[5];
		
		number[0] = 10;
		number[1] = 15;
		number[2] = 40;
		number[3] = 56;
		number[4] = 198;
		
		int sum = number[0] + number[1] + number[2] + number[3] + number[4];
		System.out.println("Sum of Array: " +sum);
		
		int len = number.length;
		System.out.println("Lenth of this array is: " + len);
	}
}
