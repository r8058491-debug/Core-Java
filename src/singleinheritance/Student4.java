package singleinheritance;

public class Student4 extends Person4{
	int rollNo;
	String course;
	
	Student4(String name, int age, int rollNo, String course){
		super(name,age);
		this.rollNo=rollNo;
		this.course=course;
	}
	
	void display() {
		super.details();
		System.out.println("Roll No. :"+ rollNo);
		System.out.println("Course :"+ course);
	}
	public static void main(String[]args) {
		Student4 s=new Student4("Rajat", 21,101, "B.Com");
		s.display();
	}

}
