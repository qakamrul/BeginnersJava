package oop;

public class WrapperClass {

	public static void main(String[] args) {
		
		//Wrapper class can convert primitive data to Object
		//Wrapper class can convert Object to primitive data
		
		//Autoboxing: Primitive --> Object
		
		int x = 30;
		
		Integer y = Integer.valueOf(x);
		System.out.println("Y = " + y);
		
		Integer z = x; //Integer.valueOf(x) - Auto-boxing
		System.out.println("Z = " + z);
		
		//Unboxing: Object --> Primitive
		
		Double d = new Double(10.5);
		double dd = d; //d.doubleValue() - Auto-Unboxing
		System.out.println(dd);	
	}
}
