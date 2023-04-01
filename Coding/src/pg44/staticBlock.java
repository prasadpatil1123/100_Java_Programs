package pg44;

public class staticBlock {

	public static void main(String[] args) {
		System.out.println("Main method is Executed.");
	}

	static {
		System.out.println("Static Block."); 
	}

}
// Output:
//Static Block.
//Main method is Executed.