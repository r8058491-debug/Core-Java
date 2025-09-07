package circle_details;
import java.util.Scanner;
public class Circle {
	double radius;
	double ar_circle;
	double per_circle;
	
	void input() {
		Scanner src=new Scanner(System.in);
		System.out.println("Radius :");
		radius=src.nextDouble();
		src.close();
	}
	
	void calculate_Area() {
		ar_circle=(Math.PI*radius*radius);
	}
	
	void calculate_Perimeter() {
		per_circle=(2*Math.PI*radius);
	}
	
	void display() {
		System.out.println("Radius :"+radius);
		System.out.println("Area :"+ar_circle);
		System.out.println("Perimeter :"+per_circle);
	}

}
