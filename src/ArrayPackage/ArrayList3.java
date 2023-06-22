package ArrayPackage;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {

	public static void main(String[] args) {
		
		//SORTING: ArrayList
		
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(10);
		num.add(25);
		num.add(-3);
		num.add(0);
		num.add(34);
		num.add(5);
		num.add(40);
		
		System.out.println("Before SORTING: " + num);
		
		Collections.sort(num);
		System.out.println("After SORTING in Ascending: " + num);
		
		Collections.sort(num, Collections.reverseOrder());
		System.out.println("Using Reverse now in Descending: " + num);
	}
}
