package practiceQuestions;

import java.net.Socket;
import java.util.function.Function;

public class First {
	public static void main(String[]args) {
		Function<String,Integer> n=s-> (s.length()*2);
		System.out.println("Twice Length Of String :"+n.apply("Hello"));
	}
}