package begineerJava;
import java.util.Scanner;

public class LogicalOrOperatorPractice {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a Character: ");
		
		char ch = input.next().charAt(0);
		
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("Small Letter");
		}
		else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Capital Letter");
		}
		else {
			System.out.println("Not a Letter");
		}
		input.close();
	}

}
