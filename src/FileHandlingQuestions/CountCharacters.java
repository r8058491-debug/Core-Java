package FileHandlingQuestions;
import java.io.*;
public class CountCharacters {
	public static void main(String[]args) {
		try {
			FileReader fr=new FileReader("output.txt");
			int ch;
			int count=0;

			while((ch=fr.read())!=-1){
				char c=(char)ch;
				if(c !=' ') {
					count++;
				}
			}
			fr.close();
			System.out.println("Total Characters :"+count);
		}catch(IOException e) {
			e.getStackTrace();
		}
	}
}
