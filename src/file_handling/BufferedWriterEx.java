package file_handling;

import java.io.*;

public class BufferedWriterEx {
	public static void main(String[]args) {
		try {
		BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt",true));
		//Append karne ke liye true diya parameters mein agar kuch nahi likhte to jo purana hai vo hat jaata or yeh naya ban jaata....
		String a[]= {"Hello ","Mini","How are you"};
		for(String writer:a) {
			bw.write(writer);
		}
		bw.close();
		System.out.println("Appended Successfully....");
		}catch(IOException e) {
			e.getStackTrace();
		}
	}

}
