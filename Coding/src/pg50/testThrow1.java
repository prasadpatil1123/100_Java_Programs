package pg50;

public class testThrow1 {

	static void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException(" Age is Not Valid . ");
		} else {
			System.out.println("Welcome to Programming.");
		}
	}

	public static void main(String[] args) {

		validate(25); // Welcome to Programming.
		System.out.println("Rest of The code."); // Rest of The code.
		
		validate(13);
		/*
		 * Exception in thread "main" java.lang.ArithmeticException: Age is Not Valid .
		 * at pg50.testThrow1.validate(testThrow1.java:7) at
		 * pg50.testThrow1.main(testThrow1.java:18)
		 * 
		 */

		System.out.println("Rest of The code."); 
	}

}
