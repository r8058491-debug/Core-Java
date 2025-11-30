package shopping_cart_system;

public class Grocery extends Product {
	private String expireDate;
	public Grocery(String id,String name,double price,int quantity,String expire) {
		super(id,name,price,quantity);
		this.expireDate=expire;
	}
	
	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	@Override
	public double applyDiscount(int quantity) {
		String couponCode ="127";	
		if(couponCode!=("127")) {
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
		System.out.println("Grocery Id :"+getProductId()+" | Price of Grocery :"+getPrice()+" | Quantity of Grocery :"+getQuantity()+" |Expire Date :"+getExpireDate());
	}



}
