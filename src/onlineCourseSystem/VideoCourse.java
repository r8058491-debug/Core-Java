package onlineCourseSystem;

public class VideoCourse extends Course {
	
	private int totalHours;
	
	public  VideoCourse(String id,String name,String subject,double price,int totalhours) {
		super(id,name,subject,price);
		this.totalHours=totalhours;
	}
	public int getTotalHours() {
		return totalHours;
	}
	public void setTotalHours(int totalHours) {
		this.totalHours = totalHours;
	}

	@Override
	public void showDetails() {
		System.out.println("Video Course Id :"+getId()+" | Course Name :"+getName()+" | Subject :"+getSubject()+" | Price :"+getPrice()+" | Total Hours :"+ getTotalHours());
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
