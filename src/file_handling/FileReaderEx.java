package file_handling;

import java.io.*;

public class FileReaderEx {
	public static void main(String[]args) {
		try {
			FileReader fr=new FileReader("output.txt");
			int character;
			int count=0;
			character=fr.read();
			while(character!=-1) {
				count++;
				System.out.println((char)character);
				character=fr.read();
			}
			System.out.println("Count Characters :"+count);
			fr.close();
		}catch(IOException e) {
			e.getStackTrace();
		}
	}

}
