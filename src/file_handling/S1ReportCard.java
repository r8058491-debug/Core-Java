package file_handling;

import java.io.Serializable;

public class S1ReportCard implements Serializable{
	private static final long serialVersionUID = 1L;
	
	String name;
	int age;
	String subject;
	
	public S1ReportCard(String n,int a,String sub) {
		this.name=n;
		this.age=a;
		this.subject=sub;
	}

}
