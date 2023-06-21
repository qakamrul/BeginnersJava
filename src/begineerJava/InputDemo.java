package begineerJava;
import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter any Text: ");
		String name = input.nextLine();
		
		input.close();
				
		System.out.println("You entered this Text: " + name);
	}
}
