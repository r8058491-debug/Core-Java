package FileHandlingQuestions;
import java.io.*;
public class CountWords {
	public static void main(String[]args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("output.txt"));
			String line;
			int countWords=0;
			while((line=br.readLine())!=null) {
				String arr[]=line.split(" ");
				countWords+=arr.length;
			}
			System.out.println("Words Count :"+countWords);
			br.close();
		}catch(IOException e) {
			System.out.println("Error :"+e.getStackTrace());
		}
	}

}
