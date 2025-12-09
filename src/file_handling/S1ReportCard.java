package file_handling;

import java.io.Serializable;

public class S1ReportCard implements Serializable{
	private static final long serialVersionUID = 1L;
	
	String name;
	int age;
	
	public S1ReportCard(String n,int a) {
		this.name=n;
		this.age=a;
	}

}
