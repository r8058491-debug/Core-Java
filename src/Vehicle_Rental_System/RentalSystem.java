package Vehicle_Rental_System;
import java.util.*;

public class RentalSystem {
	private static List<Vehicle> vehicles=new ArrayList<>();
	private static List<Vehicle> rentedvehicles=new ArrayList<>();
	private static List<Car> car=new ArrayList<>();
	private static List<Bike> bike=new ArrayList<>();
	private static List<Truck> truck=new ArrayList<>();

	private static Scanner sc=new Scanner(System.in);

	public static void main(String[]args) throws VehicleNotAvailableException {
		//		(String carId,String brand,int average,double price,boolean isAvailable)

		initializeData();
		int choice;



		do {
			System.out.println("\n-------Welcome to Jagjee Vehicle Rental System-----");
			System.out.println("1. Show All Vehicles :");
			System.out.println("2. Vehicle For Rent :");
			System.out.println("3. Return a vehicle :");
			System.out.println("4. Update Vehicle :");
			System.out.println("5. Remove Vehicle :");
			System.out.println("6. All Rented Vehicle :");
			System.out.println("7. Exit :");
			System.out.println("Enter the choice :");
			choice=sc.nextInt();

			switch(choice) {

			case 1 -> showAllVehicles();
			case 2 -> rentVehicle(choice);
			case 3 -> returnVehicle();
			case 4 -> updateVehicle();
			case 5 -> removeVehicle();
			case 6 -> showRentedVehicle();
			case 7 -> System.out.print("Thank You!!! For Choosing Jagjee Vehicle Rental System.....");
			default -> System.out.print("Invalid Choice !!! Try Again");
			}
		}while(choice!=7);
	}
	private static void showAllVehicles() {
		int c;
		do {
			System.out.println("\n--Available Vehicles");
			System.out.println(" 1. Car :");
			System.out.println(" 2. Bike :");
			System.out.println(" 3. Truck :");
			System.out.println(" 4. All Vehicles :");
			System.out.println(" 5. Exit :");
			System.out.println(" Enter the choice :");
			c=sc.nextInt();

			switch(c) {
			case 1 -> displayCar();
			case 2 -> displayBike();
			case 3 -> displayTruck();
			case 4 -> displayAllVehicle();
			case 5 -> System.out.print("EXIT:");
			default -> System.out.println("Invalid Choice.");

			}

		}while(c!=5);
	}
	private static void rentVehicle(int days) throws VehicleNotAvailableException {
		sc.nextLine();
		System.out.println("Enter the Brand :");
		String b=sc.nextLine();
		System.out.println("Enter the days :");
		days=sc.nextInt();
		Vehicle p=findVehicleByBrand();
		if(p==null) { throw new VehicleNotAvailableException("Vehicle Not Available...");
		}else {
			System.out.println("Vehicle "+ b +" rented "+" for "+vehicles.get(days));
			System.out.println("Rented Successfully");
			rentedvehicles.add(p);
		}
	}
	private static void returnVehicle() {
		sc.nextLine();
		System.out.println("Enter the Vehicle Id :");
		String v=sc.nextLine();
		for(Vehicle vc:vehicles) {
			if(vc.getvId().equalsIgnoreCase(v)) {
				if(vc.isAvailable()) {
					vc.returnVehicle(v);
					System.out.println("Vehicle Returned Successfully..");
				}
				
			}
			else {
				System.out.println("This vehicle is not rented...");
			}
			return;
		}
		System.out.println("Vehicle Not Found!!");

	}
	private static void updateVehicle() {
		System.out.print("Enter the Id :");
		String id=sc.next();
		Vehicle obj=findVehicleById();
		//		Vehicle pobj=obj.getBrand();
		System.out.print(" Do you want to update the brand of Vehicle ?");
		String brand=sc.next();
		for(Vehicle v:vehicles) {
			v.setBrand(brand);
		}
		System.out.println("Updated Successfully....");

	}
	private static void removeVehicle() {
		sc.nextLine();
		System.out.print("Enter the Vehicle ID :");
		String vI=sc.nextLine();
		Vehicle vd=findVehicleById();
		if(vI.equals(vd)) {
			vehicles.remove(vI);
		}
		System.out.println("Removed Successfully...");

	}

	private static void showRentedVehicle() {
		System.out.println("\n------ALL RENTED VEHICLES------");
		for(Vehicle v:rentedvehicles) {
			v.toString();
		}

	}
	private static Vehicle findVehicleByBrand(){
		sc.nextLine();
		System.out.println("Enter the Brand :");
		String b=sc.nextLine();
		for(Vehicle v:vehicles) {
			v.getBrand().equalsIgnoreCase(b);
			return v;
		}
		return null;

	}
	private static void displayAllVehicle() {
		for(Vehicle v:vehicles) {
			System.out.println(v);
		}
	}
	private static void displayTruck() {
		for(Vehicle t:truck) {
			System.out.println(t);
		}
	}
	private static void displayBike() {
		for(Vehicle b:bike) {
			System.out.println(b);
		}
	}
	private static void displayCar() {
		for(Vehicle c:car) {
			System.out.println(c);
		}
	}
	private static void initializeData() {
		Car c1=new Car("DL3S1234","Range Rover",150,150000.00);
		Car c2=new Car("HR516374","Thar",140,100000.50);
		Bike b1=new Bike("DL3F473","Maruti Suzuki",130,87000.00);
		Bike b2=new Bike("KRST243","Nano",100,70000.00);
		Truck t1=new Truck("HR5123","Tango",150,150000.00);
		Truck t2=new Truck("DL12C3","Maruti",170,200000.00);
		vehicles.add(c1);
		vehicles.add(c2);
		car.add(c1);
		car.add(c2);
		vehicles.add(b1);
		vehicles.add(b2);
		bike.add(b1);
		bike.add(b2);
		vehicles.add(t1);
		vehicles.add(t2);
		truck.add(t1);
		truck.add(t2);

	}

	//1st Mistake--> Jab parameters mein id le rahe ho to niche users se id nahi maangoge...phir sidha for each loop chala kar Vehicle list se vehicles 
	private static Vehicle findVehicleById() {
		System.out.println("Enter the Vehicle Id :");
		String pid=sc.nextLine();
		for(Vehicle i:vehicles)
			if(i.getvId().equalsIgnoreCase(pid)){
				return i;
			}
		return null;
	}
}
