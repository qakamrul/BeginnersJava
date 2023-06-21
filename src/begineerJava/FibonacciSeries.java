package begineerJava;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//FIBONACCI Series: 0, 1, 1, 2, 3, 5, 8, ....
		
		Scanner input = new Scanner(System.in);
		System.out.print("How many FIBONACCI number you want to Print? : ");
		int totalNum = input.nextInt();
		input.close();
		
		int num1 = 0;
		int num2 = 1;
		int fiboNum = 0;
		
		System.out.print("Fibonacci Series: " + num1 + ", " + num2);
		
		for (int i = 1; i <= totalNum-2; i++) {
			
			fiboNum = num1 + num2; //0+1=1, 
			System.out.print(", " + fiboNum); //1, 
			
			num1 = num2;
			num2 = fiboNum;
			fiboNum = 0;
		}
	}
}
