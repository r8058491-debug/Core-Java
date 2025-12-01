package FileHandlingQuestions;
import java.io.*;
public class WriteDataIntoFile {
	public static void main(String[]args) {
		try {
			FileWriter fw=new FileWriter("Text.txt");
			fw.write("I am a Java Developer.");
			System.out.println("Created  Successfully And Previous Records Erased Successfully...");
			fw.close();
		}catch(IOException e) {
			System.out.println("Error :"+e.getStackTrace());
		}
	}

}
