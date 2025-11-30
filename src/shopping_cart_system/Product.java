package shopping_cart_system;

public abstract class Product implements Discountable {
	private String productId;
	private String name;
	private double price;
	private int quantity;
	
	public Product(String id,String name,double p,int q) {
		this.productId=id;
		this.name=name;
		this.price=p;
		this.quantity=q;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
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

	public abstract void getDetails();
	public abstract double applyDiscount(int quantity);

	@Override
	public String toString() {
		return "Product [ProductId =" + productId + ", Name = "+ name +", Price =" + price + ", Quantity=" + quantity + "]";
	}
	

}
