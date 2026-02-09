package javaBASICS;

public class Anonymous_Test {
	public static void main(String[]args) {
		Anonymous_INNER_CLASS sc=new Anonymous_INNER_CLASS(1700);
		sc.processPayment( new Anonymous_INNER_CLASS_INTERFACE(){
			public void pay(double amt) {
				System.out.println("Paid " + amt + " using Credit Card");
			}
		});
	}

}
