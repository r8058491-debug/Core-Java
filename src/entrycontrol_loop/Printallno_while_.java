package entrycontrol_loop;

public class Printallno_while_ {
	public static void main(String[]args) {
		int n=1;
		while(n<=100) {
			if(n%7==0 && n%5!=0 ) {
				System.out.println(n);
			}
			n++;
		}
	}

}


