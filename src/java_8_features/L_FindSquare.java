package java_8_features;

public class L_FindSquare {
	public static void main(String[]args) {
		//.........Lambda = method implementation as value.......
		//Square1 s -> Interface type ka reference
		//s -> ek object reference jo method ko hold karta hai...
		Square1 s =(n) -> n*n;
		//Lambda call karne ke liye
		int result=s.calculate(5);
		//Print karane ke liye
		System.out.println(result);
	}
}
