package begineerJava;

public class LoopDemo {
	
	public static void main(String[] args) {
		
		//For Loop
		//FOR (Initialization; Condition; Increment){}
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		//While Loop
		//Initialization
		int j = 1;
		
		while (j <= 50) { //Condition
			
			System.out.println(j);
			j += 2; //Increment
		}
		
		//DO While Loop
		int k = 1; //Initialization
		
		do {
			System.out.println(k);
			k++; //Increment
		}while(k <= 10); //Condition
	}

}
