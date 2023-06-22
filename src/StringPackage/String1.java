package StringPackage;

public class String1 {

	public static void main(String[] args) {
		
		//STRING: is a sequence of Characters
		//Create String: Option 1 - Using String Class
		
		String s1 = "Kamrul Alam";
		String s2 = new String("kamrul Alam");
		
		//Character type Arrays is also called STRING
		char[] s3 = {'F','a','t','i','m','a'};
		
		System.out.println("S1 = " + s1);
		System.out.println("S2 = " + s2);
		System.out.println(s3);
		
		int len = s1.length();
		System.out.println("\nLength of S1: " + len);
		
		//Check whether s1 and s2 are Equal or not
		//Method 1: Equal, Contains, Equal Ignore Case
		if(s1.equalsIgnoreCase(s2)) {
			
			System.out.println("S1 and S2 are Equal");
		}
		else {
			
			System.out.println("S1 and S2 are NOT Equal");
		}
	}
}
