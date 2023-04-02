package pg56;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {

		Random t = new Random();

		for (int c = 0; c <= 10; c++) {
			System.out.print(t.nextInt(100) + " "); // 24 33 44 29 78 12 23 27 14 28 72  95 18 50 2 23 8 32 55 29 64 18 47 82 8 18 61 37 16 96 93 19 66 
		}

	}

}
