package FileHandlingQuestions;
import java.io.*;
public class Read_PrintFile_Content {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("Text.txt");//File ka naam
			int ch;
			//Character by Character reading karega yeh....
			while((ch=fr.read())!=-1) {
				System.out.print((char)ch);
			}
			fr.close();
			
		}catch(IOException e) {
			
			System.out.println("Error :"+e.getStackTrace());
		}

	}

}
