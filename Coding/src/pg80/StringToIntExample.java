package pg80;

public class StringToIntExample {

	public static void main(String[] args) {
		String s = "200";
		int i = Integer.parseInt(s);
		System.out.println(s + 100); // 200100
		System.out.println(i + 100); // 300
	}

}
