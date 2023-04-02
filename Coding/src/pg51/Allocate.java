package pg51;

public class Allocate {

	public static void main(String[] args) {

		try {
			long data[] = new long[1000000000];
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally block will execute always.");
		}
	}
}
/*
 * Output :
 * 
 * Exception in thread "main" Finally block will execute always.
 * java.lang.OutOfMemoryError: Java heap space at
 * pg51.Allocate.main(Allocate.java:8)
 * 
 */
