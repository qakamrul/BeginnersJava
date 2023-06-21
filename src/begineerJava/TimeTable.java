package begineerJava;
import java.util.Scanner;

public class TimeTable {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter Initial Number: ");
		int num1 = input.nextInt();
		
		System.out.print("Please enter Final Number: ");
		int num2 = input.nextInt();
		
		int result = 1;
		
		for (int i = num1; i <= num2; i++) {
			for(int j = 1; j <= 10; j++) {
				
				result = i * j;
				System.out.println(i +" x " + j + " = " + result);
			}
			System.out.println();
		}
		input.close();
	}
}
