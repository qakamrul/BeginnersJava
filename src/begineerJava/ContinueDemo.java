package begineerJava;

public class ContinueDemo {

	public static void main(String[] args) {
		
		//Continue statement test
		
		for (int i = 1; i <= 20; i++) {
			
			if(i == 10) {
				System.out.println("It will skip " + i + " from the Loop");
				continue;
			}
			System.out.println(i);
		}
	}
}
