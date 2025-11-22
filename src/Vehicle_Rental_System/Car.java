package Vehicle_Rental_System;

public class Car extends Vehicle{
	public Car(String id,String brand,int average,double price) {
	super(id,brand,average,price);
	}
	
	public double calculateRentalCost(int days) {
		return getPrice()* days;
	}

}
