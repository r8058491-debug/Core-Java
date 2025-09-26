package singleinheritance;

public class Vehicle1 {
	String brand;
	
	Vehicle1(String brand){
		this.brand=brand;
	}
	
	void start() {
		System.out.println(brand + "is starting.");
	}

}
