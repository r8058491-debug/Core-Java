package employee_salary;
import java.util.Scanner;
public class Employee {

	int empId;
	String empName;
	float basicSalary;
	float HRA;
	float DA;
	float net_salary;
	
	void input() {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the Id :");
		empId=src.nextInt();
		System.out.println("Enter the name :");
		empName=src.next();
		System.out.println("Enter the basic salary :");
		basicSalary=src.nextFloat();
		
		src.close();
	
	}
	
	void calculate() {
		HRA=(0.20f*basicSalary);
		DA=(0.50f*basicSalary);
		net_salary=(basicSalary+HRA+DA);
		
	}
	
	void display() {
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name :"+empName);
		System.out.println("Net Salary :"+net_salary);
	}

}
