package singleinheritance;

public class Person4 {
	String name;
	int age;
	Person4(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void details() {
		System.out.println("Name :"+ name);
		System.out.println("Age :"+ age);
	}
}
