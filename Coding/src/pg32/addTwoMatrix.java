package pg32;

import java.util.Scanner;

public class addTwoMatrix {

	public static void main(String[] args) {
		int m, n, c, d;
		Scanner ic = new Scanner(System.in);
		System.out.println("Enter the number of rows & columns : ");
		m = ic.nextInt();
		n = ic.nextInt();
		int x1[][] = new int[m][n];
		int x2[][] = new int[m][n];
		int sum[][] = new int[m][n];

		System.out.println("Element of First Matrix : ");
		for (c = 0; c < m; c++) {
			for (d = 0; d < n; d++) {
				x1[c][d] = ic.nextInt();
			}
		}
		System.out.println("Element of second Matrix : ");
		for (c = 0; c < m; c++) {
			for (d = 0; d < n; d++) {

				x2[c][d] = ic.nextInt();

			}
		}
		for (c = 0; c < m; c++) {
			for (d = 0; d < n; d++) {
				sum[c][d] = x1[c][d] + x2[c][d];

			}
		}
		System.out.println("Addition of two Matrix : ");
		for (c = 0; c < m; c++) {
			for (d = 0; d < n; d++) {
				System.out.print(sum[c][d] + "\t");
			}
			System.out.println();
		}

		ic.close();
	}

}
