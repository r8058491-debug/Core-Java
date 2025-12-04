package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationReportCard {
	public static void main(String[]args) {
		//String name,int age,int cclass,String sub,int marks;
//		StudentReportCard s=new StudentReportCard("Rajat",21,12,"Math",95);
////Serialization.....		
//		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("StudentReportCard.ser"))){
//			oos.writeObject(s);
//		}catch(IOException e) {
//			System.out.println("Error :"+e.getStackTrace());
//		}

		
//		//Serialize with serialVersionUid		
//		S1ReportCard ss=new S1ReportCard("Rajat",23);
//		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("S1ReportCard.ser"))){
//			oos.writeObject(ss);
//		}catch(IOException e) {
//			System.out.println("Error :"+e.getLocalizedMessage());
//		}
		
		
//Deserialization.......
//		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("StudentReportCard.ser"))){
//			StudentReportCard s1= (StudentReportCard)ois.readObject();
//			System.out.println("Object deserialized :"+"\nName :"+s1.name+"\nAge :"+s1.age+"\nClass :"+s1.cclass+"th"+"\nSubject :"+s1.sub+"\nMarks :"+s1.marks+"%");
//		}catch(IOException | ClassNotFoundException e) {
//			System.out.println("Error :"+e.getLocalizedMessage());
//		}
		
		
		//Deserialize with serialVersionUid
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("S1ReportCard.ser"))){
			S1ReportCard s1=(S1ReportCard)ois.readObject();
			System.out.println("Object Deserialized :"+"\nName :"+s1.name+"\nAge :"+s1.age);
		}catch(IOException | ClassNotFoundException e) {
			System.out.println("Error :"+e.getLocalizedMessage());
		}
	}

}
