package onlineCourseSystem;

public abstract class Course implements Enrollable {
	private String id;
	private String name;
	private String subject;
	private double price;
	private String type;
	public Course(String i, String n,String s,double p) {
		this.id=i;
		this.name=n;
		this.subject=s;
		this.price=p;
		this.type=type;
	}
	
	
	
	
	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}
	


    @Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", subject=" + subject + ", price=" + price + ", type=" + type
				+ "]";
	}



	public abstract void showDetails();
	
	public abstract double applyDiscount();
	
	public abstract  void enroll(Student student);

}
