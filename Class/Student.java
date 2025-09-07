package student_marks;
import java.util.Scanner;

public class Student {
	int rollNo;
	String name;
	int marks1;
	int marks2;
	int marks3;
	int total;
	int average_marks;

	void input() {
	Scanner src=new Scanner(System.in);
	System.out.println("Enter the roll no.:");
	rollNo=src.nextInt();
	System.out.println("Enter the name :");
	name=src.next();
	System.out.println("Enter the marks of Science :");
	marks1=src.nextInt();
	System.out.println("Enter the marks of Math :");
	marks2=src.nextInt();
	System.out.println("Enter the marks of Hindi :");
	marks3=src.nextInt();
	src.close();
}

void calculate() {
total=marks1+marks2+marks3;
average_marks=total/3;
}

void display() {
System.out.println("Roll number :"+ rollNo);
System.out.println("Name :"+ name);
System.out.println("Marks of Science :"+ marks1);
System.out.println("Marks of Math :"+ marks2);
System.out.println("Marks of Hindi :"+ marks3);
System.out.println("Total :"+ total);
System.out.println("Average :"+ average_marks);
}

}
