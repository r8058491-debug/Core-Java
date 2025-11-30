package onlineCourseSystem;

public class LiveCourse extends Course {
	
	int durationHours;
	public LiveCourse(String id,String name,String subject,double price,int duration) {
		super(id,name,subject,price);
		this.durationHours=duration;
	}
	
	

	public int getDurationHours() {
		return durationHours;
	}



	public void setDurationHours(int durationHours) {
		this.durationHours = durationHours;
	}



	@Override
	public void showDetails() {
		System.out.println("Live Course Id :"+getId()+" | Course Name :"+getName()+" | Subject :"+getSubject()+" | Price :"+getPrice()+" | Duration Hours :"+ getDurationHours());
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
