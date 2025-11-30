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
			System.out.println("5. Details With Price :");
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
		products.add(new Clothing("C13","Sweater",2000.00,5,"Woollen"));
		products.add(new Clothing("C12","Kurta",1000.50,2,"Cotton"));
		products.add(new Electronics("E223","Oven",5000.00,1,5));
		products.add(new Electronics("E123","Speaker",10000.00,2,4));
		products.add(new Grocery("G23","Oats",5000.00,5,"after 36 months"));
		products.add(new Grocery("G112","PeanutButter",7050.50,5,"after 12 months"));
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

				if(q>p.getQuantity()) {
					try {
						throw new OutOfStockException("We don't have this much quantity..");
					}catch(OutOfStockException e) {
						System.out.println(e.getMessage());
						return;
					}
				}
			}
			cart.add(p);
			System.out.println(p.toString() +" added to cart.");
			return;
		}
		System.out.println("Invalid Product Id");
	}

	private static void removeProductFromCart() {
		sc.nextLine();
		System.out.println("Enter the Product Id to remove :");
		String r=sc.nextLine();
		for(Product p:cart) {
			if(p.getProductId().equals(r)) {
				cart.remove(r);
				System.out.println("Removed Successfully!!");
			}
		}
		System.out.println("Not Found");

	}

	private static void displayCart() {
		for(Product p:cart) {
			System.out.println(p);
		}
		if(cart.isEmpty()) {
			System.out.println("Add to Something...");
		}

	}
	private static void detailsWithPrice() {
		for(Product c:cart) {
			c.getDetails();
		}

	}

}
