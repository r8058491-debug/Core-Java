package singleinheritance;

public class Manager2 extends Employee2 {
	String dept;
	
	Manager2(String name,double salary,String dept){
		super(name,salary);
		this.dept=dept;
	}
	
	void display() {
		super.display();
		System.out.println("Department :" + dept);
	}
	public static void main(String[]args) {
		Manager2 m= new Manager2("Rajat",15000000,"Developer");
		m.display();
	}

}
