package practiceQuestions;

import java.util.Arrays;
import java.util.List;

public class Third {
	public static void main(String[]args) {
		List<String> m=Arrays.asList("Hello","Two","Buddies");
		m.forEach(n->n.concat(n));
		System.out.println();
	}
}
