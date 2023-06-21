package begineerJava;

public class BreakAndContinueTogether {

	public static void main(String[] args) {
		
		//Break & Continue statement together
		
		for (int i = 1; i <= 20; i++) {
			
			if (i == 10) {
				continue;
			}
			
			if (i > 13) {
				break;
			}
			System.out.println(i);
		}
	}
}