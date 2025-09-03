package nestedforloopques;

public class inverted_right_angled_triangle {
	public static void main(String[]args) {
		for(int r=5;r>=1;r--) {
			for(int c=1;c<=r;c++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
