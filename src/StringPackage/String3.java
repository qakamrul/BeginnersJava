package StringPackage;

public class String3 {

	public static void main(String[] args) {
		
		//Different Methods for String
		
		String country = "Bangladesh is my country";
		System.out.println(country);
		
		//Will show Character from index 0 or given index
		char ch = country.charAt(0); 
		System.out.println(ch);
		
		//Will show Ascii value of given index character
		int value = country.codePointAt(0);
		System.out.println(value);
		
		//Will show Position of a character or String
		int pos = country.indexOf("my"); //If there is multiple same character, then only 1st character position will return
		System.out.println(pos);
		
		//Will show Position of Character or String from last if there is multiple
		pos = country.lastIndexOf('n');
		System.out.println(pos);
		
		//If there is EXTRA SPACE at the head & trail of a string, it will remove those
		country = "    Bangladesh is    my country   "; //It will not remove extra space from middle of the string
		System.out.println("Before Trim: " + country);
		String s = country.trim();
		System.out.println("After Trim: " + s);
	}
}
