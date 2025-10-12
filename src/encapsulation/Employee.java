package encapsulation;

import java.util.Scanner;

public class Employee {
	private int empid;
	private String ename;
	private float basicsalary;
	
	void input() {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the empId :");
		empid=src.nextInt();
		System.out.println("Enter the empName :");
		src.nextLine();
		ename=src.nextLine();
		System.out.println("Enter the Basic Salary :");
		basicsalary=src.nextFloat();
		src.close();
	}
	
	void calculateNetSalary() {
		float hra=(0.20f * basicsalary);
		float da=(0.50f * basicsalary);
		float netsalary=basicsalary + hra + da;
		System.out.println("Net Salary :" + netsalary);
	}
	
	void display() {
		System.out.println("Employee Id :"+ empid);
		System.out.println("Employee Name :"+ ename);
		System.out.println("Basic Salary :"+ basicsalary);
		calculateNetSalary();
	
	}
	public static void main(String[]args) {
		Employee e= new Employee();
		e.input();
		e.display();
	}
}
