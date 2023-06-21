package Assignment3;
import java.util.Scanner;

public class Product {
	
	public static void main(String[] args) {
	
		int id;
		String title;
		double price;
		String description;
		String category;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter Id: ");
		id = sc1.nextInt();
				
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter Title: ");
		title = sc2.nextLine();
				
		Scanner sc3 = new Scanner(System.in);
		System.out.print("Enter Price: ");
		price = sc3.nextDouble();
				
		Scanner sc4 = new Scanner(System.in);
		System.out.print("Enter Description: ");
		description = sc4.nextLine();
				
		Scanner sc5 = new Scanner(System.in);
		System.out.print("Enter Category: ");
		category = sc5.nextLine();
				
		System.out.println("\n\nID: " + id + "\nTitle: " + title + "\nPrice: " + price + " Taka" + "\nDescription: " + description + "\nCategory: " + category);
		
		sc1.close();
		sc2.close();
		sc3.close();
		sc4.close();
		sc5.close();
	}
}
