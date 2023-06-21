package begineerJava;

public class MathClass {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 10;
		double z = 8.4;
		
		System.out.println("Max of X & Y is: " + Math.max(x, y));
		System.out.println("Min of X & Y is: " + Math.min(x, y));
		System.out.println("Absolute value of Y: " + Math.abs(y));
		System.out.println("X to the power Y: " + Math.pow(x, y));
		System.out.println("Round of Z: " + Math.round(z));
		System.out.println("Value of PI: " + Math.PI);
	}
}
