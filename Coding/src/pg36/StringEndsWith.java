package pg36;

public class StringEndsWith {

	public static void main(String[] args) {

		String s1 = "Java By Developer";
		System.out.println(s1.endsWith("r"));// true
		System.out.println(s1.endsWith("oper")); // true
		System.out.println(s1.endsWith("Loper")); // false

	}

}
