package Hospital_System;

public class Patient extends Person implements Billable {
	private String patientId;
	private String type;
	
	public Patient(String name,int age,int contactNo,String patientId,String type) {
		super(name,age,contactNo);
		this.patientId=patientId;
		this.type=type;
	}
	
	
	public String getPatientId() {
		return patientId;
	}


	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void getDetails() {
		System.out.println("Patient Name :"+ getName() + "Patient Id :"+ getPatientId()+ "Type :" + getType() );
	}
	
	public double generateBill() {
		return type.equalsIgnoreCase("Surgery") ? 5000:10000;
	}
}
