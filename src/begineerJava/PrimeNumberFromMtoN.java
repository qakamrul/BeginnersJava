package begineerJava;
import java.util.Scanner;

public class PrimeNumberFromMtoN {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Starting Number: ");
		int startingNum = input.nextInt();
		
		System.out.print("Enter Ending Number: ");
		int endingNum = input.nextInt();
		input.close();
		int count = 0;
		
		System.out.print("\nPRIME NUMBER's Betwen " + startingNum + " and " + endingNum + " are: ");
		
		for(int num = startingNum; num <= endingNum; num++) {
			if (num == 0 || num == 1) {
				//Ignore 0 & 1, those are not prime
			}else {

				for (int i = 2; i < num; i++) {
					
					if(num % i == 0) {
						count++;
						break;
					}
				}
				if(count == 0) {
					System.out.print(num + ", ");
				}
				count = 0;
			}
		}
	}
}