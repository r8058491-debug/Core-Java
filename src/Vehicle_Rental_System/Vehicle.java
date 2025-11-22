package Vehicle_Rental_System;

public abstract class Vehicle implements Rentable {
	private String vId;
	private String brand;
	private int average;
	private double price;
	private boolean isAvailable;
	public Vehicle(String vId, String brand, int average, double price) {
		super();
		this.vId = vId;
		this.brand = brand;
		this.average = average;
		this.price = price;
		this.isAvailable=true;
	}
	public String getvId() {
		return vId;
	}
	public String getBrand() {
		return brand;
	}
	public int getAverage() {
		return average;
	}
	public double getPrice() {
		return price;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void setAvailable(boolean available) {
		isAvailable=available;
	}
	
	public abstract double calculateRentalCost(int days);
	
	public void rent(int days) throws VehicleNotAvailableException{
		if(!isAvailable) throw new VehicleNotAvailableException(brand +"is already rented.");
		
		setAvailable(false);
		double cost=calculateRentalCost(days);
		System.out.println("Vehicle Rented "+ brand);
		
	}
	
	public void returnVehicle() {
		setAvailable(true);
		System.out.println(brand +"has been returned & is now available..");
		
	}
	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", brand=" + brand + ", average=" + average + ", price=" + price
				+ ", isAvailable=" + isAvailable + "]";
	}
	
	

}
