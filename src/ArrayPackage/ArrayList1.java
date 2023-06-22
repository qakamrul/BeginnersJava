package ArrayPackage;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		//ARRAY LIST
		ArrayList<Integer> number = new ArrayList<>();
		System.out.println("Initial Array Size: " + number.size());
		
		//Adding array values
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(4,50);
		
		//Print Array values - OPTION 1
		System.out.println("Print Array values - Option 1: " + number);
		
		//Print Array values - OPTION 2: For Each Loop
		System.out.print("Print Array values - Option 2: ");
		for(int x : number) {
			
			System.out.print(x + ", ");
		}
		
		//Print Array values - OPTION 3: ITERATOR
		Iterator<Integer> itr = number.iterator();
		System.out.print("\nPrint Array values - Option 3: ");
		
		while(itr.hasNext()) {
			
			System.out.print(itr.next() + ", ");
		}
		
		//FEW METHODS OF ARRAY LIST CLASS
		
		int arraySize = number.size();
		System.out.println("\n\nSize of this Array is: " + arraySize);
		
		boolean empty = number.isEmpty();
		System.out.println("Is this Array Empty?: " + empty);
		
		boolean contain = number.contains(30);
		System.out.println("Is 30 contains in this Array?: " + contain);
		
		number.remove(3);
		System.out.println("After removing 3rd Index value: " + number);
		
		int x = number.get(2);
		System.out.println("Get index 2 value: " + x);
		
		int y = number.lastIndexOf(20);
		System.out.println("Get index of value 20: " + y);
		
		number.set(3, 40);
		System.out.println("Set/Edit/modify 3rd index value with 40: " + number);
	}
}
