package nestedforloopques;

public class Diamond_pattern {
	public static void main(String[]args) {
		int n=5;
		for(int r=1;r<=n;r++) {
			for(int s=0;s<=(n-r);s++) {
				System.out.print(" ");
			}for(int c=1;c<=(2*r)-1;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int r=4;r>=1;r--) {
			for(int s=0;s<=n-r;s++) {
				System.out.print(" ");
			}for(int c=1;c<=(2*r)-1;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
