package Vehicle_Rental_System;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle implements Rentable {
	protected String vId;
	protected String brand;
	protected int average;
	protected double dailyRate;
	protected boolean isAvailable;
	
	public Vehicle(String vId, String brand, int average, double price) {
		super();
		this.vId = vId;
		this.brand = brand;
		this.average = average;
		this.dailyRate = price;
		this.isAvailable=true;
	}

	public abstract void rent(int days) throws VehicleNotAvailableException ;
	public abstract void returnVehicle(String id);
	public abstract double calculateRentalCost(int days);

	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", brand=" + brand + ", average=" + average + ", price=" + dailyRate
				+ ", isAvailable=" + isAvailable + "]";
	}

	public String getvId() {
		return vId;
	}

	public void setvId(String vId) {
		this.vId = vId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public double getdailyRate() {
		return dailyRate;
	}

	public void setdailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = true;
	}

}
