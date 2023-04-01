package pg42;

public class methods {

	methods() {
		System.out.println("Only Methods.");
	}

	public static void main(String[] args) {

		StaticMethods(); // Static Method.
		methods M = new methods(); // Only Methods.
		M.nonStaticMethod(); // Only Non Static Method.
		
	}

	static void StaticMethods() {
		System.out.println("Static Method.");
	}

	void nonStaticMethod() {
		System.out.println("Only Non Static Method.");
	}

}
