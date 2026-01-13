package neeraj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("Text.txt") );
			BufferedWriter bw=new BufferedWriter(new FileWriter("student.txt"));
					
			String line;
			while((line=br.readLine())!=null) {   
				bw.write(line);
				System.out.println("Copy Successfull...");
				
			}
			bw.close();
			br.close();
		}catch (IOException e) {
			System.out.println("Error : "+e.getStackTrace()); 
					
				
				
			}
		}
				

	}


