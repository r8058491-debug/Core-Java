package file_handling;

import java.io.Serializable;

class StudentReportCard implements Serializable {
	String name;
	int age;
	int cclass;
	String sub;
	int marks;

	public StudentReportCard(String n,int a,int c,String s,int m) {
		this.name=n;
		this.age=a;
		this.cclass=c;
		this.sub=s;
		this.marks=m;
	}


}
