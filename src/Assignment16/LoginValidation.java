package Assignment16;
import java.util.Scanner;

public class LoginValidation {

	public static void main(String[] args) {
		
		//Validate user based on username & password
		//Input username & password until user = "kamrul" & password = "123456"
		//If user & password does not match, print "Username/password is incorrect. Please try again!"
		//If user & password match, print "Welcome to the system"
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Username: ");
		String userName = input.nextLine();
		
		System.out.print("Enter Password: ");
		String password = input.nextLine();
		
		int count = 0;
		
		do{
			
			if(userName.contains("Kamrul") && password.contains("123456")) {
				
				System.out.println("Welcome to the system");
				break;
			}
			else {
				System.out.println("Wrong Username or Password");
				count++;
			}
		}while(count == 0);
	}
}
