package Vehicle_Rental_System;

import java.util.Scanner;

public class Car extends Vehicle{
	private static Scanner sc=new Scanner(System.in);
	public Car(String carId,String brand,int average,double price) {
		super(carId,brand,average,price);
		
	}
	
	public double calculateRentalCost(int days) {
		return getdailyRate()* days;
	}

	@Override
	public void rent(int days) throws VehicleNotAvailableException {
		if(!isAvailable()) {throw new VehicleNotAvailableException(brand+"Member_INNER_CLASS"+vId+"is not available for rent.");
		}
		System.out.println("Member_INNER_CLASS rented for"+ days+"...");
		setAvailable(false);
	}

	@Override
	public void returnVehicle(String id) {
		System.out.println("Member_INNER_CLASS"+id+"returned...");
		setAvailable(true);
	}

	@Override
	public String toString() {
		return "Member_INNER_CLASS [vId=" + vId + ", brand=" + brand + ", average=" + average + ", dailyRate=" + dailyRate
				+ ", isAvailable=" + isAvailable + "]";
	}

}
