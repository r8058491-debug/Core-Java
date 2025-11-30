package onlineCourseSystem;

import java.util.*;

public class Main {
	private static  List<Student> students=new ArrayList<>();
	private static List<Course> courses=new ArrayList<>();
	private static List<Instructor> instructors=new ArrayList<>();
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[]args)  throws EnrollmentException{
		initializeCourse();
		int choice;
		do {
			System.out.println("\n--Welcome to Jagjee Study Center----");
			System.out.println("1. Show All course : ");                                            
			System.out.println("2. Register Student :");                                             
			System.out.println("3. Enroll into course :");                                            
			System.out.println("4. Generate Enrollment Report :"); 
			System.out.println("5. Show Student Details :");
			System.out.println("6. Show course details :");                                                  
			System.out.println("7. Register Instructor :");                                                                                                       
			System.out.println("8. Exit :");
			System.out.println("Enter the Choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1 -> showAllCourse();
			case 2 -> registerStudent();
			case 3 -> enrollCourse(students);       
			case 4 -> enrollmentReport();
			case 5 -> showstudentDetails();
			case 6 -> showCourseDetails();
			case 7 -> registerInstructor();
			case 8 -> System.out.println("Exit....Thank you! Choose my Jagjee Study Center .");
			default-> System.out.println("Invalid Choice!");
			}

		}while(choice!=8);
	}

	private static void initializeCourse() {
		// Live Course ke parameters --->>> String id,String name,String subject,double price,int duration
		// Video Course ke parameters ---->>>> String id,String name,String subject,double price,int totalhours
		courses.add(new  LiveCourse("123","Full Stack Developer","Core Java",35000.00,2));
		courses.add(new LiveCourse("245","Chartered Accountant","Accountancy",2000,1));
		courses.add(new LiveCourse("789","Trading","Insider Trading",1500,2));
		courses.add(new VideoCourse("129","UPSC","Reasoning",2500,360));
		courses.add(new VideoCourse("456","SSC","General Knowledge",1800,480));
	}

	private static void showAllCourse() {
		System.out.println("\n-----------------------------------------------ALL COURSES------------------------------------------------------");
		for(Course c:courses) {
			c.showDetails();
		}
	}


	private static void registerStudent() {
		sc.nextLine();
		System.out.println("Enter User Id :");
		String uid=sc.nextLine();
		Student check=findStudentById(uid);
		if(check!=null) {
			System.out.println("Student Already Registered...");
			return;
		}
		System.out.println("Enter Password :");
		String p=sc.nextLine();
		System.out.println("Enter Student Name :");
		String sName=sc.nextLine();
		System.out.println("Enter Contact Number :");
		int cnum=sc.nextInt();
		System.out.println("Enter Course Type(Live/Video) :");
		String ctype=sc.nextLine();
		sc.nextLine();
		Student s=new Student(uid,p,sName,cnum,ctype);
		students.add(s);
		System.out.println("Student Registered Successfully....");
	}

	private static Student findStudentById(String uid) {
		for(Student s:students) {
			if(s.getStudentId().equalsIgnoreCase(uid)) {
				return s;
			}
		}
		return null;

	}

	private static void enrollCourse(List<Student> enrolledCourses) throws EnrollmentException {
		sc.nextLine();
		System.out.println("Which Course Do You Want To Enroll In It ?");
		String cenroll=sc.nextLine();
		System.out.println("Enter the Student Id :");
		String id=sc.nextLine();
		Student k=findStudentById(id);
		if(k==null) {
			throw new EnrollmentException("Try to Register First....");
		}else {
			enrolledCourses.add(k);
			System.out.println("Enrolled Successfully...."+ k);
		}


	}
	private static void enrollmentReport() {
		sc.nextLine();
		System.out.println("Enter the Student Id :");
		String sid=sc.nextLine();
		Student s=findStudentById(sid);
		if(s==null) {
			System.out.println("Student Not Found ");
			return;
		}
		System.out.println("\n---Enrollment Report-----");
		s.showReport();
	}
	private static void showstudentDetails() {
		System.out.println("\n-----ENROLLED COURSES STUDENT LIST--------");
		for(Student s:students) {
			s.showReport();
		}
		
	}
	private static void showCourseDetails() {
		sc.nextLine();
		System.out.println("Which course you are interested in :");
		String interested=sc.nextLine();
		Course k=findCourseById(interested);
		if(k==null) {
			System.out.println("This course is not exists in our course....");
			return;
		}
		System.out.println(interested+"Course Details :"+k.getPrice());


	}
	private static void registerInstructor() {
		sc.nextLine();
		System.out.println("Enter the Instructor Id :");
		String iid=sc.nextLine();
		Instructor old=instructorFindById(iid);
		if(old!=null) {
			System.out.println("Instructor Already Registered...");
		}
		System.out.println("Enter the Instructor Name :");
		String iname=sc.nextLine();
		System.out.println("Enter the Instructor Experience :");
		int iexperience=sc.nextInt();
		sc.nextLine();
		Instructor i=new Instructor(iid,iname,iexperience);
		instructors.add(i);
		System.out.println("Instructor Registered Successfully...");
	}



private static Instructor instructorFindById(String iid) {
	for(Instructor i:instructors) {
		if(i.getInstructorId().equalsIgnoreCase(iid)) {
			return i;
		}
	}
	return null;
}

private static Course findCourseById(String id) {
	for(Course c:courses) {
		if(c.getId().equalsIgnoreCase(id)) {
			return c;
		}
	}
	return null;
}
}
