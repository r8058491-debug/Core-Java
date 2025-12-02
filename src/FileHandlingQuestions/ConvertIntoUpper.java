package FileHandlingQuestions;
import java.io.*;
public class ConvertIntoUpper {
	public static void main(String[]args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("Text.txt"));//Source Text File
			BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));//Destination Text File
			String line;
			while((line=br.readLine())!=null) {
				String h=line.toUpperCase();
				bw.write(h);
			}
			System.out.println("Converted Successfully...");
			br.close();
			bw.close();
		}catch(IOException e) {
			System.out.println("Error :"+e.getStackTrace());
		}
	}

}
