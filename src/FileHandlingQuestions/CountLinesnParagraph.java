package FileHandlingQuestions;
import java.io.*;
public class CountLinesnParagraph {
	public static void main(String[]args) {
		try {
			FileWriter fw=new FileWriter("Text.txt");
			fw.write("Hello Guys");
			fw.write("\nOk then We will Meet Again...");
			fw.write("\n");
			fw.write("\nHELLO");
			fw.close();
			BufferedReader br=new BufferedReader(new FileReader("Text.txt"));
			String line;
			int countLine=0;
			int countParagraph=0;
			while((line=br.readLine())!=null) {
				System.out.println(line);
				if(line.isBlank()) {
					countParagraph++;
				}
				countLine++;
			}
			System.out.println("Total Lines :"+countLine);
			System.out.println("Total Paragraph :"+countParagraph);
			
			br.close();
		}catch(IOException e) {
			System.out.println("Error :"+e.getStackTrace());
		}
	}

}
