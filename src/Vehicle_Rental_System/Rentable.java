package Vehicle_Rental_System;

public interface Rentable {
	void rent(int days) throws VehicleNotAvailableException;
	void rentVehicle();

}
