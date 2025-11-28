package shopping_cart_system;

public class Clothing extends Product{
	public Clothing(String id,double price,int quantity) {
		super(id,price,quantity);
	}
	@Override
	public double applyDiscount() {
		double p=getPrice()*0.5;
	    double finalPrice=getPrice()-p;
	    return finalPrice=getPrice()*this.getQuantity();
	}
	@Override
	public void getDetails() {
		System.out.println("Clothes Id :"+getProductId()+" | Price of Clothes :"+getPrice()+" | Quantity of Clothes :"+getQuantity());
	}

	
	    
	

}
