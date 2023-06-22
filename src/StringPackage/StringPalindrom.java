package StringPackage;

public class StringPalindrom {

	public static void main(String[] args) {
		
		String s1 = "Madam";
		StringBuffer sb = new StringBuffer(s1);
		
		String s2 = sb.reverse().toString();
		
		if(s1.equalsIgnoreCase(s2)) {
			
			System.out.println(s1 + ": PALINDROM STRING");
		}
		else {
			
			System.out.println(s1 + ": NOT A PALINDROM STRING");
		}
	}
}
