package Assignment14;
import java.util.Scanner;

public class MtoNPallindromNumer {

	public static void main(String[] args) {
		
		//Find PALINDROM NUMBERS from M to N with user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Starting Number: ");
		int startingNum = input.nextInt();
		
		System.out.print("Enter Ending Number: ");
		int endingNum = input.nextInt();
		input.close();
		
		System.out.print("\nPALINDORM numbers between " + startingNum + " and " + endingNum + " are: ");
		int sum = 0 ;
		int count = 0;
		
		for (int x = startingNum; x <= endingNum; x++) {
			
			int temp = x;
			while(temp != 0) {
				
				int r = temp % 10;
				sum = sum * 10 + r;
				temp = temp / 10;
			}
			
			if (sum == x) {
				
				count ++;
				System.out.print(sum + ", ");
			}
			sum = 0;
		}
		System.out.println("\nTotal number of Palindrom between " + startingNum + " and " + endingNum + " is: " + count);
	}
}
