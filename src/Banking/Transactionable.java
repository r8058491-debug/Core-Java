package Banking;

//Kyunki requirement mein diya hai ki har account transaction perform karega..

public interface Transactionable {
	void performTransaction(double amt);

}
