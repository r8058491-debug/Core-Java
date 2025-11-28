package shopping_cart_system;

import java.util.*;

public class Main {
	private static List<Product> products=new ArrayList<>();
	private static List<Product> cart=new ArrayList<>();
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[]args) {
		initializeData();
		int choice;
		do {
			System.out.println("\n----Welcome to Jagjee Shopping Era----");
			System.out.println("1. Show Products :");
			System.out.println("2. Add to Cart :");
			System.out.println("3. Remove Cart :");
			System.out.println("4. Display Cart :");
			System.out.println("5. Price Details :");
			System.out.println("6. Exit :");
			System.out.println("Enter the choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1 -> showProducts();
			case 2 -> addCart();
			case 3 -> removeProductFromCart();
			case 4 -> displayCart();
			case 5 -> detailsWithPrice();
			case 6 -> System.out.println("Exit..Thank You for choose Jagjee Shopping Era..");
			default -> System.out.println("Invalid Choice!");
			}
		}while(choice!=6);


	}

	private static void initializeData() {
		products.add(new Clothing("C13",2000.00,5));
		products.add(new Clothing("C12",1000.50,2));
		products.add(new Electronics("E223",5000.00,1));
		products.add(new Electronics("E123",10000.00,2));
		products.add(new Grocery("G23",5000.00,5));
		products.add(new Grocery("G112",7050.50,5));
	}

	private static void showProducts() {
		for(Product p:products) {
			p.getDetails();
		}
	}

	private static void addCart()  {
		sc.nextLine();
		System.out.println("Enter the Product ID to add :");
		String id=sc.nextLine();
		System.out.println("Enter the Quantity :");
		int q=sc.nextInt();

		for(Product p:products) {
			if(p.getProductId().equals(id)) {
				cart.add(p);
				System.out.println(p.toString() +" added to cart.");
				return;
			}
			else if(p.getQuantity()<=q)  throws OutOfStockException{
				throw new ("We don't have too much quantity...");
				
				return;
			}
		}
		System.out.println("Invalid Product Id");
	}

	private static void removeProductFromCart() {
		sc.nextLine();
		System.out.println("Enter the Product Id to remove :");
		String r=sc.nextLine();
		for(Product p:cart) {
			if(p.getProductId().equals(r)) {
				cart.remove(p);
			}
		}
		System.out.println("Not Found");

	}

	private static void displayCart() {
		for(Product p:cart) {
			System.out.println(p);
		}
		if(cart==null) {
			System.out.println("Add to Something...");
		}

	}
	private static void detailsWithPrice() {
		for(Product c:cart) {
			c.getDetails();
		}

	}

}
