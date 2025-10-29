package arrayExample;

public class Countevenodd {
	public static void main(String[]args) {
		int num[]= {1,2,3,4,5,6,8,7,6};
		int even=0;
		int odd=0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("How Many Even Numbers in num :"+even);
		System.out.println("How Many Odd Numbers in num :"+odd);
	}

}
