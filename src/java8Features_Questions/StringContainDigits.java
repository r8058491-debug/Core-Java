package java8Features_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StringContainDigits {
	public static void main(String[]args) {
		List<String> add=Arrays.asList("Hello1","123","Hello","Five","5");
		Predicate<String> check=n -> n.matches(".*\\d.*");
		add.forEach(k->{ boolean result=check.test(k);
		System.out.println(k+ "->"+result);
		});
	}
}
