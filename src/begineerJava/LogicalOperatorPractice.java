package begineerJava;
import java.util.Scanner;

public class LogicalOperatorPractice {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char ch = input.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonent");
		}
		input.close();
	}

}
