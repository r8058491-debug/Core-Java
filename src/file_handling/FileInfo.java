package file_handling;
import java.io.*;
public class FileInfo {
	public static void main(String[]args) {
			File fi=new File("Text.txt");
			if(fi.exists()) {
				System.out.println("File Name :"+ fi.getName());
				System.out.println("File Absolute Path :"+fi.getAbsolutePath());
				System.out.println("File can read :"+fi.canRead());
				System.out.println("File can write :"+fi.canWrite());
				System.out.println("File Size in Bytes :"+fi.length());
			}else {
				System.out.println("File does not exist...");
			}
	}

}
