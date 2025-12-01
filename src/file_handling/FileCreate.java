package file_handling;

import java.io.*;

public class FileCreate {
	public static void main(String[]args) {
		try {
		File file=new File("Text.txt");
		if(file.createNewFile()) {
			System.out.println("File created "+file.getName());
		}else {
			System.out.println("File already created...");
		}
		}catch(IOException e) {
			e.getStackTrace();
		}

	}
}
