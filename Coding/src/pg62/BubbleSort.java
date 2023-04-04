package pg62;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		int c, d, n, swap;
		try (Scanner sc = new Scanner(System.in)) {
			System.err.println("Input Number of Integers to sort");
			n = sc.nextInt();
			int array[] = new int[n];
			System.out.println("Enter " + n + " integers");
			for (c = 0; c < n; c++) {
				array[c] = sc.nextInt();
			}
			for (c = 0; c < n - 1; c++) {
				for (d = 0; d < n - c - 1; d++) {
					if (array[d] > array[d + 1]) {
						swap = array[d];
						array[d] = array[d + 1];
						array[d + 1] = swap;
					}
				}
			}
			System.out.println("Sorted list of numbers");
			for (c = 0; c < n; c++) {
				System.out.println(array[c]);
			}
		}

	}

}
