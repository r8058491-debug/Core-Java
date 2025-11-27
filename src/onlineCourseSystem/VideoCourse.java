package onlineCourseSystem;

public class VideoCourse extends Course {
	public  VideoCourse(String id,String name,String subject,double price) {
		super(id,name,subject,price);
	}

	@Override
	public void showDetails() {
		System.out.println("Video Course Id :"+getId()+"Course Name :"+getName()+"Subject :"+getSubject()+"Price :"+getPrice());
	}

	@Override
	public double applyDiscount() {
		double q=getPrice()*10/100;
		return getPrice()-q;
	}

	@Override
	public void enroll(Student student) {
		// TODO Auto-generated method stub
		
	}

}
