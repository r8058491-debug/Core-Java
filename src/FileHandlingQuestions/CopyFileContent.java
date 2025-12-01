package FileHandlingQuestions;
import java.io.*;
public class CopyFileContent {
	public static void main(String[]args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("Text.txt"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));
			String line;
			while((line=br.readLine())!=null){
				bw.write(line);
				System.out.println("Copied Successfully....");
			}
			bw.close();
			br.close();
		}catch(IOException e) {
			System.out.println("Error :"+e.getStackTrace());
		}
	}

}
