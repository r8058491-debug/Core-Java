package Hospital_System;
import java.time.LocalDate;

public class Appointment {
	private Integer appid;
	private Patient patient;
	private Doctor doctor;
	private LocalDate date;
	public Appointment(Integer appid, Patient patient, Doctor doctor, LocalDate date) throws InvalidAppointmentException {
		if(date.isBefore(LocalDate.now())) {
			throw new InvalidAppointmentException("Cannot book in the past bro!!!Try to select next date..");
		}
		this.appid = appid;
		this.patient = patient;
		this.doctor = doctor;
		this.date = date;
	}
	
	public void displaySummary() {
		System.out.println("\n ********Appointment Summary********");
		patient.getDetails();
		doctor.getDetails();
		System.out.println("Date :" +date);
		System.out.println("Total Cost :"+ patient.generateBill());
	}

	public Integer getAppid() {
		return appid;
	}

	public void setAppid(Integer appid) {
		this.appid = appid;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
	

}
