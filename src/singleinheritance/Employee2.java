package singleinheritance;

public class Employee2 {
	String name;
	double salary;
	
	Employee2(String name, double salary){
		this.name=name;
		this.salary=salary;
	}
	
	void display() {
		System.out.println("Name :"+ name);
		System.out.println("Salary :"+ salary);
	}

}
