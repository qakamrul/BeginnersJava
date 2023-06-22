package StringPackage;

public class StringBuilder1 {

	public static void main(String[] args) {
		
		//String class not changeable 
		//StringBuilder is always changeable
		
		StringBuilder str = new StringBuilder("Kamrul");
		
		str.append(" Alam");
		System.out.println(str);
		
		//Few Methods of String Builder
		
		str.reverse();
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		
		str.delete(0, 7);
		System.out.println(str);
	}
}
