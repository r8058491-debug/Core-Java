package onlineCourseSystem;

import java.util.*;

public class Student  {
	private String studentId;
	private String studentName;
	private long contact;
	private String password;
	private String Ctype;
	
	public Student(String id,String name,long c,String p,String t) {
		this.studentId=id;
		this.studentName=name;
		this.contact=c;
		this.password=p;
		this.Ctype=t;
	}

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
}
