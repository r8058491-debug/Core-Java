package file_handling;
import java.io.*;
public class FileDelete {
	public static void main(String[]args) {
		
			File fd=new File("output.txt");
			if(fd.delete()) {
				System.out.println("Deleted :"+fd.getName());
			}else {
				System.out.println("Unable to delete this file..");
			}
	}

}
