package FileHandlingQuestions;
import java.io.*;
public class AppendDataToAnExistingFile {
	public static void main(String[]args) {
		try {
			FileWriter fw=new FileWriter("Text.txt",true);
			fw.write("And I am 23 Years Old.");
			System.out.println("Appended Successfully...");
			fw.close();
		}catch(IOException e) {
			System.out.println("Error :"+e.getStackTrace());
		}
	}

}
