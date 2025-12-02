package FileHandlingQuestions;
import java.io.*;
import java.util.Scanner;
public class SearchWord {
	public static void main(String[]args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("Text.txt"));
			String line;
			Scanner src=new Scanner(System.in);
			System.out.println("Enter the Word :");
			String word=src.nextLine();
			while((line=br.readLine())!=null) {
				if(br.readLine().equalsIgnoreCase(word)) {
					System.out.println("word");
				}
				else {
					System.out.println("Word not exist in this file..");
				}
			}
		}catch(IOException e) {
			System.out.println("Error :"+e.getStackTrace());
		}
	}

}
