package nestedforloopques;

public class inverted_half_pyramid_with_num {
	public static void main(String[]args) {
		for(int r=5;r>=1;r--) {
			for(int c=1;c<=r;c++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
