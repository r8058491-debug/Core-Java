package onlineCourseSystem;

public class LiveCourse extends Course {
	public LiveCourse(String id,String name,String subject,double price) {
		super(id,name,subject,price);
	}

	@Override
	public void showDetails() {
		System.out.println("Live Course Id :"+getId()+"Course Name :"+getName()+"Subject :"+getSubject()+"Price :"+getPrice());
	}

	@Override
	public double applyDiscount() {
		double p=getPrice()*5/100;
		return getPrice()-p;
	}

	@Override
	public void enroll(Student student) {
			
	}
}
