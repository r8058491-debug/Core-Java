package Vehicle_Rental_System;

public class Truck extends Vehicle {
	public Truck(String truckId,String brand,int average,double price) {
		super(truckId,brand,average,price);
		
	}

	@Override
	public void rent(int days) throws VehicleNotAvailableException {
		if(!isAvailable()) {throw new VehicleNotAvailableException(brand+"truck"+vId+"is not available for rent...");
		}
		System.out.println("Truck"+vId+"rented for "+days+"..");
	}

	@Override
	public void returnVehicle(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculateRentalCost(int days) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Truck [vId=" + vId + ", brand=" + brand + ", average=" + average + ", dailyRate=" + dailyRate
				+ ", isAvailable=" + isAvailable + "]";
	}
	
	

}
