package file_handling;

import java.io.*;

public class FileWriterExample{
	public static void main(String[]args) {
		try {
		FileWriter fw=new FileWriter("Text.txt");
		fw.write("Hello World...");
		fw.write("My Name is Rajat ");
		fw.close();
		System.out.println("File Written Successfully...");
		}catch(IOException e) {
			e.getStackTrace();
		}
		
	}
}