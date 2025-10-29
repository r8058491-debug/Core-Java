package _abstract;

public class Circle1 extends Shape1 {
	public float area(float r) {
		return (float) (Math.PI*r*r);
	}
	public float perimeter(float r) {
		return (float) (2*Math.PI*r);
	}
}
