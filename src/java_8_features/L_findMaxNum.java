package java_8_features;
public class L_findMaxNum {
	public static void main(String []args) {
		MaxNumbers3 num=(a,b)->(a>b)?a:b;
		int result=num.max(5,7);
		System.out.println(result);
	}

}
