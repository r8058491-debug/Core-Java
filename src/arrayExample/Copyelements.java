package arrayExample;

public class Copyelements {
	public static void main(String[]args) {
		int a[]= {10,20,30};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println("Elements of Second Array :");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
