package file_handling;
import java.io.*;
public class PrintWriterExample {
	public static void main(String[]args) {
		try {
			PrintWriter pw=new PrintWriter("output.txt");
			pw.println("Name :Rajat");
			pw.println("Class : 8");
			pw.println("Subject : Math");
			pw.printf("Score :%d%%",95);
			pw.close();
		}catch(IOException e) {
			e.getStackTrace();
		}
	}

}
