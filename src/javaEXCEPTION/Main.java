package javaEXCEPTION;

import java.io.FileReader;

public class Main{
	public static void main(String[]args) throws Exception {
		//		int a=5;
		//		int b=0;
		//		try {
		//			int c=a/b;	
		//			System.out.println(c);
		//		}
		//		catch(ArithmeticException e) {
		//			System.out.println(e);
		//			System.out.println("Hello");
		//		}
		//		
		//		
		//	}
//		method1();
//	}
//
//	public static void method1() throws Exception{
//		method2();
//	}
//	public static void method2() throws Exception{
//		try {
//			FileReader fr=new FileReader("outputs.txt");				
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//			throw new Exception("Bye");
//		}finally {
//			System.out.println("Hello Guys We are Back!");
//		}
//	}
		
		method1();			
	}
		public static void method1() {
			method2();
		}
		
		public static void method2() {
			int a=2;
			int b=0;
			try {
				int c=a/b;
				System.out.println(c);
			}
			catch(ArithmeticException e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
}
