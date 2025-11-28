package shopping_cart_system;

public class Grocery extends Product {
	public Grocery(String id,double price,int quantity) {
		super(id,price,quantity);
	}
	@Override
	public double applyDiscount() {
		double r=getPrice()*0.15;
		double finalPrice= getPrice()-r;
		return finalPrice=getPrice()*this.getQuantity();
	}

	@Override
	public void getDetails() {
		System.out.println("Grocery Id :"+getProductId()+" | Price of Grocery :"+getPrice()+" | Quantity of Grocery :"+getQuantity());
	}

	

}
