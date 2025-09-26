
public class Car1 extends Vehicle1{
	String model;
	
	Car1(String brand,String model){
		super(brand);
		this.model=model;
	}
	
	void drive() {
		System.out.println(brand + model + "is driving.");
	}
	public static void main(String[]args) {
		Car1 c=new Car1("Toyota", "Corolla");
		c.drive();
		c.start
		
	}
	
}
