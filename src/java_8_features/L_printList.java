package java_8_features;

import java.util.Arrays;
import java.util.List;
public class L_printList {
	public static void main(String[]args) {
		List<String> names=Arrays.asList("Hello","Hi","Namastey");
		
		StringPrinter2 printer=(s)->System.out.println(s);
		for(String name :names) {
			printer.print(name);
		}
	}

}
