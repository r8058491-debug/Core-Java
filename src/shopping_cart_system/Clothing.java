package shopping_cart_system;

public class Clothing extends Product{
	private String type;
	public Clothing(String id,String name,double price,int qty,String type) {
		super(id,name,price,qty);
		this.type=type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public double applyDiscount(int quantity) {
		String couponCode ="123a";	
		if(couponCode!=("123a")) {
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
		System.out.println("Clothes Id :"+getProductId()+" | Price of Clothes :"+getPrice()+" | Quantity of Clothes :"+getQuantity()+" | Type of Cloth:"+getType());
	}







}
