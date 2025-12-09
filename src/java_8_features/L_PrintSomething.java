package java_8_features;
import java.lang.*;
public class L_PrintSomething {
	Runnable4 r=()->System.out.println("Hello Thread");
	Thread t=new Thread(r);
	t.start();

}
