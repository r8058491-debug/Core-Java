package javaINNERCLASS;

public class Anonymous_INNER_CLASS {
	private double totalAmount;
	
	public Anonymous_INNER_CLASS(double ta) {
		this.totalAmount=ta;
	}
	
	public void processPayment(Anonymous_INNER_CLASS_INTERFACE paymentMethod) {
		paymentMethod.pay(totalAmount);
	}

}
