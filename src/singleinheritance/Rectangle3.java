package singleinheritance;

public class Rectangle3 extends Shape3{
	float length;
	float width;
	
	Rectangle3(String shapeName, float length,float width){
		super(shapeName);
		this.length=length;
		this.width=width;
	}
	
	float calculateArea() {
		return length*width;
	}
	
	void display() {
		super.display();
		System.out.println("Area of "+ shapeName + "=" + calculateArea());
	}
	public static void main(String[]args) {
		Rectangle3 r=new Rectangle3("Rectangle",5f,5f);
		r.display();
	}

}
