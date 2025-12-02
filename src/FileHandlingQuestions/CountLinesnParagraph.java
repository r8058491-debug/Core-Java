package FileHandlingQuestions;
import java.io.*;
public class CountLinesnParagraph {
	public static void main(String[]args) {
		try {
			FileWriter fw=new FileWriter("Text.txt");
			fw.write("Hello Guys");
			fw.write("\nOk then We will Meet Again...");
			fw.close();
			BufferedReader br=new BufferedReader(new FileReader("Text.txt"));
			String line;
			int countLine=0;
			int countParagraph=0;
			while((line=br.readLine())!=null) {
				System.out.println(line);
				countLine++;
			}
			System.out.println("Total Lines :"+countLine);
			
			br.close();
		}catch(IOException e) {
			System.out.println("Error :"+e.getStackTrace());
		}
	}

}
