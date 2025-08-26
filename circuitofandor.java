package operator_ques;

public class circuitofandor {
	public static void main(String[]args) {
		int ntand=44;
		int ntor=36;
		int b=(ntand%4==0 &&  ntand%5==0)?1:0;//isme dono true nahi to 0 aaya matlab false
		System.out.println(b);
		int d=(ntand%4==0 && ntand%11==0)?1:0;//isme dono true hai to 1 aaya matlab true
		System.out.println(d);
		int e=(ntor%5==0 || ntor%7==0)?1:0;//isme dono false hai to 0 aaya
		System.out.println(e);
		int g=(ntor%4==0 || ntor%7==0)?1:0;//isme ek true hai to 1 aaya
		System.out.println(g);	
		}
		
	}


