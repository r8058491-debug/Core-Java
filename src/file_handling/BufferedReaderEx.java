package file_handling;

import java.io.*;

public class BufferedReaderEx {
	public static void main(String[]args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("output.txt"));
			String line;
			int countLine=0;
			int countWords=0;
			int countChar=0;
			while((line=br.readLine())!=null) { 
				System.out.println(line);
				countChar+=line.length();
				String a[]=line.split(" ");
				countWords+=a.length;
				countLine++;

				System.out.println("Total Line :"+countLine+" | Total Characters :"+countChar+" | Total Words :"+countWords);
				br.close();
			}

		}catch(IOException e) {
			e.getStackTrace();
		}
	}

}
