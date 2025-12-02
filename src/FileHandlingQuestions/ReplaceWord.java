package FileHandlingQuestions;
import java.io.*;
public class ReplaceWord {
	public static void main(String[]args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("Text.txt"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));
			String line;

			while((line=br.readLine())!=null) {
				line=line.replace("Hello", "Hi");
				bw.write(line);
				bw.newLine();
			}
			br.close();
			bw.close();
			System.out.println("Replaced Successfully in new File...");

		}catch(IOException e) {
			System.out.println("Error :"+e.getStackTrace());
		}
	}

}
