package Assignment15;
import java.util.Scanner;

public class ArmstrongNumberMtoN {

	public static void main(String[] args) {
		
		//Take input range from user
		//Show all the ARMSTRONG NUMBER from that range
		//Show how many ARMSTRONG NUMBER in that range
		//ARMSTRONG NUMBER: 153 > 1^3 + 5^3 + 3^3 = 153
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Starting Number: ");
		int startNum = input.nextInt();
		
		System.out.print("Enter Ending Number: ");
		int endNum = input.nextInt();
		input.close();
		
		System.out.print("\nARMSTRONG NUMBERS between " + startNum + " and " + endNum + " are: ");
		int sum = 0;
		int totalCount = 0;
		
		for (int i = startNum; i <= endNum; i++) {
			
			int temp = i;
			while(temp != 0) {
				
				int r = temp % 10;
				sum = sum + r*r*r;
				temp = temp / 10;
			}
			
			if(sum == i) {
				System.out.print(sum + ", ");
				totalCount++;
			}
			sum = 0;
		}
		System.out.println("\nTotal number of ARMSTRONG NUMBERS are: " + totalCount);
	}
}
