package arrayExample;

public class SumAllElem {
	public static void main(String[]args) {
		int elements[]= {10,20,30};
		int sum=0;
		
		for(int i=0;i<elements.length;i++) {
			
			sum=sum+elements[i];
		}
		System.out.println("Sum :"+sum);
	}

}
