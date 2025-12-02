package file_handling;
import java.io.*;
import java.util.Scanner;
public class PrintWriterExample {
	public static void main(String[]args) {
		try {
			PrintWriter pw=new PrintWriter("student.txt");
			pw.println("Rajat 8 Math 95");
			pw.println("Rohan 9 Science 90");
			pw.println("Rishi 10 English 77");
			pw.println("Akshay 11 Physics 96");
			pw.close();
			Scanner src=new Scanner(new File("student.txt"));
			while(src.hasNext()) {
				String name=src.next();
				int cclass=src.nextInt();
				String subject=src.next();
				int marks=src.nextInt();
				System.out.println("Name :"+name+" | Class :"+cclass+"th"+"| Subject :"+subject+"| Marks :"+marks+"%");
			}
			src.close();
		}catch(IOException e) {
			e.getStackTrace();
		}
	}

}
