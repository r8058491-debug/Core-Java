package nestedforloopques;

public class Inverted_right_aligned_triangle {
	public static void main(String[]args) {
		int n=5;
		for(int r=5;r>=1;r--) {
			for(int s=1;s<=(n-r);s++) {
				System.out.print(" ");
			}for (int c=1;c<=r;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
