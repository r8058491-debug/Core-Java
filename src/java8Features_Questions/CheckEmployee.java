package java8Features_Questions;

import java.util.function.Predicate;

import encapsulation.Employee;

import java.util.*;
public class CheckEmployee {
	public static void main(String[]args) {
		List<Employee> list=Arrays.asList(new Employee("Rajat","IT",65323),(new Employee("Rohan","Finance",4666)),(new Employee("Raja","IT",65000)));
		Predicate<Employee>e=n-> n.getSalary()>50000 && n.getDepartment().equalsIgnoreCase("IT");
		for(Employee f: list) {
			if(e.test(f)) {
				System.out.println(f.getName());
			}
		}

	}

}
