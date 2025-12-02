package file_handling;
import java.io.*;
public class BinaryFile {
	public static void main(String[]args) {
		try(FileInputStream fis=new FileInputStream("C:\\Users\\RAJAT\\OneDrive\\Binary File\\nature-yuh.png");
			FileOutputStream fos=new FileOutputStream("C:\\Users\\RAJAT\\OneDrive\\Attachments\\nature.png")) {
			
			int byteData;
			while((byteData=fis.read())!=-1) {
				fos.write(byteData);
			}
			System.out.println("Binary Copied Successfully");
			fis.close();
			fos.close();
		}catch(IOException e) {
			System.out.println("Error :"+e.getStackTrace());
		}
	}

}
