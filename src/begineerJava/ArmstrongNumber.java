package begineerJava;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		//Find whether a Given Number is an ARMSTRONG Number or Not.
		//153: 1^3 + 5^3 + 3^3 = 1+125+9 = 153 -> This is an Armstrong Number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to check ARMSTRONG Number: ");
		int num = input.nextInt();
		input.close();
		
		int sum = 0;
		int temp = num;
		
		while(temp != 0) {
			
			int r = temp % 10;
			sum = sum + r*r*r;
			temp = temp / 10;
		}
		if(sum == num) {
			System.out.println("\n"+ num +": is an ARMSTRONG Number");
		}
		else {
			System.out.println("\n"+ num +": is NOT an ARMSTRONG Number");
		}
		
		System.out.println(num + " " + sum);
	}
}
