package javaINNERCLASS;

public class Local_INNER_CLASS {
	private String name;
	private int totalRooms;
	private int reserveRooms;

	public Local_INNER_CLASS(String n,int tr,int rr) {
		this.name=n;
		this.totalRooms=tr;
		this.reserveRooms=rr;
	}

	public void reserveRoom(String guestName,int numOfRooms) {
		class ReservationValidator{
			boolean validate() {
				if(guestName==null || guestName.isBlank()) {
					System.out.println("Guest Name Can Not Be Empty..");
					return false;
				}if(numOfRooms<0) {
					System.out.println("Number of rooms should be positive...");
					return false;
				}if(reserveRooms + numOfRooms>totalRooms) {
					System.out.println("Not Enough rooms available...");
					return false;
				}return true;
			}
		}
		ReservationValidator rv=new ReservationValidator();
		if(rv.validate()) {
			reserveRooms+=numOfRooms;
			System.out.println("Reservation Confirmed for "+guestName + " for "+numOfRooms);
		}else {
			System.out.println("Reservation Failed...");
		}
	}

}
