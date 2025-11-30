package onlineCourseSystem;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
	private String instructorId;
	private String instructorName;
	private int experience;
	
	public Instructor(String id,String name,int e) {
		this.instructorId=id;
		this.instructorId=name;
		this.experience=e;
	}
	private static List<Instructor> instructors=new ArrayList<>();
	

	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	public String getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}


	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", instructorName=" + instructorName + ", experience="
				+ experience + "]";
	}

	
	

}
