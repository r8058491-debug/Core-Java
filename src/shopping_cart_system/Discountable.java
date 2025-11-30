package shopping_cart_system;

public interface Discountable {
	double applyDiscount(int quantity) throws InvalidCouponException;

}
