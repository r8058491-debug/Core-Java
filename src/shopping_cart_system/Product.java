package shopping_cart_system;

public abstract class Product implements Discountable {
	private String productId;
	private double price;
	private int quantity;
	
	public Product(String id,double p,int q) {
		this.productId=id;
		this.price=p;
		this.quantity=q;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public abstract void getDetails();
	public abstract double applyDiscount();

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", price=" + getPrice() + ", quantity=" + quantity + "]";
	}
	

}
