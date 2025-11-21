package Hospital_System;
import java.util.*;

public class Main {
	private static List<Doctor> doctors=new ArrayList<>();
	private static List<Patient> patients=new ArrayList<>();
	private static List<Appointment > appointments=new ArrayList<>();
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[]args) {
		initializeDate();
		int choice;
		do {
			System.out.println("---Welcome to Jagjee Hospital----");
			System.out.println("1. Register Patient");
			System.out.println("2. Book Appointment");
			System.out.println("3. Display Appointment ");
			System.out.println("4. Display Patient List");
			System.out.println("5. Display Doctor List");
			System.out.println("6. Update about the Patient");
			System.out.println("7. Exit");
			System.out.print("Enter a choice Bro!!!!");
			choice=sc.nextInt();

			switch(choice) {
			case 1 -> registerPatient(); 
			case 2 -> bookAppointment();
			case 3 -> displayAppointment();
			case 4 -> displayPatientList();
			case 5 -> displayDoctorList();
			case 6 -> updatePatient();
			case 7 -> System.out.println("Thank You!!!!For chosing my Jagjee Service....");

			default -> System.out.println("Invalid Choice! Try a correct one..");
			}
		}while(choice!=7);
	}	
		private static void updatePatient() {

		}

		private static void displayDoctorList() {

		}

		private static void displayPatientList() {

		}

		private static void displayAppointment() {

		}

		private static void bookAppointment() {
			sc.nextLine();
			System.out.println("Enter the Patient Id :");
			String patientId=sc.nextLine();

			for(Appointment a:appointments) {
				Patient old=a.getPatient();
				String oldpid=old.getPatientId();
				if(oldpid.equalsIgnoreCase(patientId)) {
					System.out.println("Appointment already booked...");
				}
			}

		}

		private static void registerPatient() {
			sc.nextLine();

			System.out.println("Enter the Patient Id: ");
			String id=sc.nextLine();

			for(Patient p:patients) {
				if(p.getPatientId().equalsIgnoreCase(id)) {
					System.out.println("Patient Already Registered....Try a new patient");
					return;
				}
			}
			System.out.println("Enter the Name :");
			String name=sc.nextLine();
			System.out.println("Enter the Age :");
			Integer age=sc.nextInt();
			System.out.println("Enter the Contact Number :");
			Integer contactNo=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Type(General/Surgery):");
			String type=sc.nextLine();
			Patient obj=new Patient(name,age,contactNo,id,type);
			patients.add(obj);
			System.out.println("Patient Registered Successfully....");
			return;
		}

		private static void initializeDate() {
			//		String name,int age,int contactNo,String docId,String spe,int ex
			doctors.add(new Doctor("Dr. Kakkar",35,442642843,"Hem102","Surgeon",5));
			doctors.add(new Doctor("Dr. Yadav",23,436728623,"tyt4738","Orthopedics",2));
			doctors.add(new Doctor("Dr. Lal",23,436348623,"wrye1232","Cardiology",2));


		}


	}
