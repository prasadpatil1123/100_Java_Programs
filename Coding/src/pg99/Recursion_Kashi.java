package pg99;

public class Recursion_Kashi {

	static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Factorial of 5 is " + factorial(5)); // Factorial of 5 is 120
	}

}
