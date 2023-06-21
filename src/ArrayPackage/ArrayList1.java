package ArrayPackage;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		//ARRAY LIST
		
		ArrayList<Integer> number = new ArrayList<>();
		System.out.println("Array size: " + number.size());
		
		//Adding elements
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(4, 50);
		
		//System.out.println(number);
		
		//Array List value can be print with FOR EACH LOOP
		/*for(int x : number) {
			System.out.print(x + ", ");
		}*/
		
		//Array List value can also be print with ITERATOR METHOD
		Iterator<Integer> itr = number.iterator();
		
		System.out.print("Array Elements: ");
		while(itr.hasNext()) {
			
			System.out.print(itr.next() + ", ");
		}
		
		System.out.println("\nArray size: " + number.size());
		
		//REMOVE Elements from ArrayList index AND Then PRINT
		number.remove(2);
		System.out.println("After Removing: " + number);
		
		number.removeAll(number);
		System.out.println("After Remove All Elements: " + number);
	}
}
