package pg39;

public class SplitExample {

	public static void main(String[] args) {

		String s1 = "Java string split method by Kashi";
		String[] words = s1.split("\\s");
		// split the string on whitespace
		// using foreach loop to print elements of string array
		for (String w : words)
			System.out.println(w);

	}

}
