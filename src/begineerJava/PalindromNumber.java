package begineerJava;
import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		
		//PALINDROM NUMBER. EXAMPLE: 12321
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to check Palindrom: ");
		int num = input.nextInt();
		input.close();
		
		int revNum = 0;
		int temp = num;
		
		while(temp != 0) {
			
			int r = temp % 10;
			revNum = revNum * 10 + r;
			temp = temp / 10;
		}
		
		if (num == revNum) {
			
			System.out.println("\nPALINDORM NUMBER");
		}
		else {
			System.out.println("\nNOT A PALINDORM NUMBER");
		}
	}
}
