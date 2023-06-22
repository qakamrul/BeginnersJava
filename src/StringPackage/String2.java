package StringPackage;

public class String2 {

	public static void main(String[] args) {
		
		String firstName = "Kamrul";
		String lastName = " Alam";
		
		//String Concatenation 
		String fullName = firstName + lastName; //by + Operator
		System.out.println("Full Name: " + fullName);
		
		fullName = firstName.concat(lastName); //by concat method
		System.out.println("Full Name: " + fullName);
		
		//Convert to UPPERCASE
		String upperName = fullName.toUpperCase();
		System.out.println("\nUpper Name: " + upperName);
		
		//Convert to lowercase
		String lowerName = fullName.toLowerCase();
		System.out.println("lower Name: " + lowerName);
		
		//Starts with method
		boolean b = firstName.startsWith("Kam");
		System.out.println("First Name starts with Kam?: " + b);
		
		//Ends with method
		boolean c = lastName.endsWith("n");
		System.out.println("Last Name ends with n?: " + c);
		
		//FOR EACH LOOP
		String[] names = {"Kamrul", "Rokhsana", "Fatima", "Suraiya", "Muhammad"};
		for(String x : names) {
			
			System.out.print(x + ", ");
		}
		
	}
}
