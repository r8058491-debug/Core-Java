package shopping_cart_system;

public class OutOfStockException extends Exception{
	public OutOfStockException(String msg) {
		super(msg);
	}

}
