package arrayExample;

public class MaxandMin {
	public static void main(String[]args) {
		int m[]= {4,5,6,66,1,2,3};
		int max=m[0];
		int min=m[0];
		
		for (int i=1;i<m.length;i++) {
			if(max<m[i]) {
				max=m[i];
			}if(min>m[i]) {
				min=m[i];
			}
		}
		System.out.println("Maximum Number :"+max);
		System.out.println("Minimum Number :"+min);
	}

}
