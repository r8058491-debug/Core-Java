package Hospital_System;

public abstract class Person {
	String name;
	int age;
	int contactNo;
	
	public Person(String n,int a,int c) {
		this.name=n;
		this.age=a;
		this.contactNo=c;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	
	public abstract void getDetails();
}
