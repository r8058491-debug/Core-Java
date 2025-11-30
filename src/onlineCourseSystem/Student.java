package onlineCourseSystem;

import java.util.*;

public class Student  {
	private String studentId;
	private String password;
	private String studentName;
	private long contact;
	private String Ctype;
	
	public Student(String id,String p,String name,long c,String t) {
		this.studentId=id;
		this.password=p;
		this.studentName=name;
		this.contact=c;
		this.Ctype=t;
	}
	private static List<Course> enrolledCourses=new ArrayList<>();

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCtype() {
		return Ctype;
	}

	public void setCtype(String ctype) {
		Ctype = ctype;
	}
	
	public void showReport() {
		System.out.println("Id :"+studentId+"| Name :"+ studentName+"/n Enrolled in :");
		if(enrolledCourses.isEmpty()) {
			System.out.println("No Courses Enrolled..");
			return;
		}
		for(Course c:enrolledCourses) {
			System.out.println(c.getSubject());
		}
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", password=" + password + ", studentName=" + studentName
				+ ", contact=" + contact + ", Ctype=" + Ctype + "]";
	}
	
	
	
}
