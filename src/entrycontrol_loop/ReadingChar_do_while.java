package entrycontrol_loop;

import java.util.Scanner;

public class ReadingChar_do_while {
	public static void main(String[]args) {
		Scanner src=new Scanner(System.in);
		char c;

		do {
			System.out.println("Enter the character :");
			c=src.next().charAt(0);
		}while((c=='a'|| c=='i' || c=='e' || c=='o' || c=='u' || c=='A' || c=='I' || c=='E' || c=='O' || c=='U'));
		System.out.println("You entered a vowel "+c);
		src.close();
		}

	}


