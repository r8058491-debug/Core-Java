package Hospital_System;

public class Doctor extends Person{
	private String docId;
	private String specialisation;
	private int experience;
	
	public Doctor(String name,int age,int contactNo,String docId,String spe,int ex) {
		super(name,age,contactNo);
		this.docId=docId;
		this.specialisation=spe;
		this.experience=ex;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	//method override
	
	public void getDetails() {
		System.out.println("Doctor :"+ getName()+"||Doctor Id :"+ getDocId()+ "Specialization :"+ getSpecialisation()+ "Experience :" + getExperience() );
	}

	@Override
	public String toString() {
		return "Doctor [Doctor Name :"+name+", docId= " + docId + ", specialisation=" + specialisation + ", experience=" + experience + "]";
	}
	
	
	
}
