package shopping_cart_system;

public class Electronics extends Product {
	private int warranty;
	public Electronics(String id,String name,double price,int quantity,int warranty) {
		super(id,name,price,quantity);
		this.warranty=warranty;
	}
	
	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public double applyDiscount(int quantity) {
		String couponCode ="125";	
		if(couponCode!=("125")) {
			try {
				throw new InvalidCouponException("Invalid Coupon");
			}catch(InvalidCouponException e) {
				System.out.println(e.getMessage());
			}
		}
		return quantity*getPrice()*0.10;
	}

	@Override
	public void getDetails() {
		System.out.println("Electronics Id :"+getProductId()+" | Price of Electronics :"+getPrice()+" | Quantity of Electronics :"+getQuantity()+" | Warranty :"+getWarranty());
	}

	

}
