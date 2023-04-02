package pg57;

public class GarbageCollection {

	public static void main(String[] args) throws Exception {

		Runtime rs = Runtime.getRuntime();
		System.out.println("Free Memory in JVM before Garbage Collection = " + rs.freeMemory());
		// Free Memory in JVM before Garbage Collection = 132894352
		rs.gc();
		System.out.println("Free Memory in JVM after Garbage Collection = " + rs.freeMemory());
		// Free Memory in JVM after Garbage Collection = 7837968

	}

}
