package java8Features_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateQuestions1 {
	public static void main(String[]args) {
		Predicate<String> sn=n->n.matches("\\d++");
		List<String>items=Arrays.asList("Hello1","Hi2","Gohuhf","123");
		
		for(String n:items) {
			System.out.println(n+" ->"+sn.test(n));
		}
		
		
	}

}
