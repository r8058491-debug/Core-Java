package Hospital_System;
import java.util.*;
import java.time.LocalDate;

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
			System.out.println("Enter a Patient Id :");
			String pid=sc.nextLine();
			sc.nextLine();
			boolean found=false;
			
			for(Patient p:patients) {
				if(p.equals(pid)) {
					found=true;
					
					System.out.println("Enter New Name :");
					String name=sc.nextLine();
					
					System.out.println("Patient Updated Successfully!");
					return;
				}
				if(!found) {
					System.out.println("Patient don't exist in the list...");
				}
			}
		}

		private static void displayDoctorList() {
			for(Doctor doc:doctors) {
				System.out.println(doc);
			}

		}

		private static void displayPatientList() {
			for(Patient pt:patients) {
				System.out.println(pt);
			}

		}

		private static void displayAppointment() {
			for(Appointment ap:appointments) {
				System.out.println(ap);
			}

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
	//2. Agar Patient present ho to pehle se patient list mein...
			Patient patient=findPatientById(patientId);
	//3. jab patient na mile to return kare....
			if(patient==null) {
				System.out.println("Patient Not Found..");
				return;
			}
	//4. agar patient mil jaaye to book appointment...
			System.out.print("Enter a Specialization:");
			String sp=sc.nextLine();
			Doctor doctor= findDoctorBySpecialization(sp);
	//5. agar doctor na mile to...
			if(doctor==null) {
				System.out.println("No Doctor available with this specialization.");
				return;
			}
	//6. jab doctor available ho...
			System.out.println("Enter a date(YYYY-MM-DD):");
			String date1=sc.nextLine();
			LocalDate date=LocalDate.parse(date1);
			System.out.println("Enter the Appointment Id :");
			int appId=sc.nextInt();
			
			try {
				Appointment appointment=new Appointment(appId,patient,doctor, date);
				appointments.add(appointment);
				System.out.println("Appointment booked Successfully.");
			}catch(InvalidAppointmentException e) {
				System.out.println("Error :"+e.getMessage());
			}
			
			

		}

		private static Doctor findDoctorBySpecialization(String sp) {
			// TODO Auto-generated method stub
			for(Doctor d:doctors) {
				if(d.getDocId().equals(sp)) {
					return d;
				}
			}
			return null;
		}
		private static Patient findPatientById(String patientId) {
			// TODO Auto-generated method stub
			for(Patient p:patients) {
				if(p.getPatientId().equals(patientId)) {
					return p;
				}
			}
			return null;
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
