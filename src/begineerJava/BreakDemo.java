package begineerJava;

public class BreakDemo {

	public static void main(String[] args) {
		
		//Testing Break statement
		
		for (int i = 1; i <= 100; i++) {
			
			if (i == 10) {
				break;
			}
			System.out.println(i);
		}
	}
}
