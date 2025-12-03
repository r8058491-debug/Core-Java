package FileHandlingQuestions;
import java.io.*;
import java.util.Scanner;
public class SearchWord {
	public static void main(String[]args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("Text.txt"));
			String line;
			boolean found=false;
			Scanner src=new Scanner(System.in);
			System.out.println("Enter the Word :");
			String word=src.nextLine();
			while((line=br.readLine())!=null) {
				if(line.contains(word)) {
					System.out.println(word +" Word exist in this file....");
					found=true;
				}
				if(!found) {
					System.out.println("Word not exist in this file..");
				}
			}
		}catch(IOException e) {
			System.out.println("Error :"+e.getStackTrace());
		}
	}

}
