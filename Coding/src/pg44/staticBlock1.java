package pg44;

public class staticBlock1 {

	public static void main(String[] args) {
		System.out.println("You are using windows_NT operating System.");

	}

	static {
		String os = System.getenv("OS");
		if (os.equals("windows_NT") != true) {
			System.exit(1);
		}
	}
}
