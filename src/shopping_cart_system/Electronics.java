package shopping_cart_system;

public class Electronics extends Product {
	public Electronics(String id,double price,int quantity) {
		super(id,price,quantity);
	}
	@Override
	public double applyDiscount() {
		double q=getPrice()*0.10;
		double finalPrice=getPrice()-q;
		return finalPrice=getPrice()*this.getQuantity();
	}

	@Override
	public void getDetails() {
		System.out.println("Electronics Id :"+getProductId()+" | Price of Electronics :"+getPrice()+" | Quantity of Electronics :"+getQuantity());
	}

	

}
