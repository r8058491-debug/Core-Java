package operator_ques;

public class usingassignmentoperator {
	public static void main(String[]args) {
		int a=5; //5
		int b=(a+=3);//8
		int c=(b-=2);//6
		int d=(c*=2);//12
		int e=(d/=5);//2
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
