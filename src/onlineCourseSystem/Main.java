package onlineCourseSystem;

import java.util.*;

public class Main {
	private static  List<Student> student=new ArrayList<>();
	private static List<Instructor> instructor=new ArrayList<>();
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[]args) {
		int choice;
		do {
			System.out.println("\n--Welcome to Jagjee Study Center----");
			System.out.println("1. Register Student :");
			System.out.println("2. Register Instructor :");
			System.out.println("3. Create course");
			System.out.println("4. Enroll into course :");
			System.out.println("5. Show All course :");
			System.out.println("6. Generate Enrollment Report :");
			System.out.println("7. Show course details :");
			System.out.println("8. Exit :");
			System.out.println("Enter the Choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1 -> registerStudent();
			case 2 -> registerInstructor();
			case 3 -> createCourse();
			case 4 -> enrollCourse();
			case 5 -> showAllCourse();
			case 6 -> enrollmentReport();
			case 7 -> showCourseDetails();
			case 8 -> System.out.println("Exit....Thank you! Choose my Jagjee Study Center .");
			default-> System.out.println("Invalid Choice!");
			}
			
		}while(choice!=8);
	}

	private static void showCourseDetails() {
		
	}

	private static void enrollmentReport() {
		
	}

	private static void showAllCourse() {
		
	}

	private static void enrollCourse() {
		
	}

	private static void createCourse() {
		
	}

	private static void registerInstructor() {
		
	}

	private static void registerStudent() {
	
	}

}
