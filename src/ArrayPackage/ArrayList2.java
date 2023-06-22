package ArrayPackage;
import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num1 = new ArrayList<>();
		ArrayList<Integer> num2 = new ArrayList<>();
		ArrayList<Integer> num3 = new ArrayList<>();
		
		num1.add(10);
		num1.add(20);
		num1.add(30);
		num1.add(40);
		System.out.println("Number1 ArrayList: " + num1);
		
		num2.add(1);
		num2.add(2);
		num2.add(3);
		num2.add(4);
		System.out.println("Number2 ArrayList: " + num2);
		
		num3.addAll(num1); //addAll() method
		System.out.println("\nNumber 3 ArrayList: " + num3);
		
		boolean equal = num1.equals(num3);
		System.out.println("Number 1 is Equal to Number 3? : " + equal);
	}
}
