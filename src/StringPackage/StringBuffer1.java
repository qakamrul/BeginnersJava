package StringPackage;

public class StringBuffer1 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Kamrul");
		System.out.println(sb);
		
		//Few methods of String Buffer
		
		sb.append(" Alam");
		System.out.println(sb);
		
		sb.append(42);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.reverse();
		sb.delete(6, 13);
		System.out.println(sb);
		
		sb.append(" Alam");
		System.out.println(sb);
		
		sb.setLength(6);
		System.out.println(sb);
	}
}
