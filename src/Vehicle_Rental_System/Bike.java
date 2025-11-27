package Vehicle_Rental_System;

public class Bike extends Vehicle {
	public Bike(String bikeId,String brand,int average,double price) {
		super(bikeId,brand,average,price);
		
	}

	@Override
	public void rent(int days) throws VehicleNotAvailableException {
		if(!isAvailable()) {
			throw new VehicleNotAvailableException(brand+"bike"+getvId()+"is not available for rent..");
		}
		System.out.println("Bike rented for"+days);
		setAvailable(false);
	}

	@Override
	public void returnVehicle(String id) {
		System.out.println("Bike"+id+"returned..");
		setAvailable(true);
	}

	@Override
	public double calculateRentalCost(int days) {
		return days*getdailyRate()-100;
	}

	@Override
	public String toString() {
		return "Bike [vId=" + vId + ", brand=" + brand + ", average=" + average + ", dailyRate=" + dailyRate
				+ ", isAvailable=" + isAvailable + "]";
	}
	

}
