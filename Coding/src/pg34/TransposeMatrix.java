package pg34;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {

		int m, n, c, d = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Rows & Columns : ");

		m = sc.nextInt();
		n = sc.nextInt();

		int matrix[][] = new int[m][n];
		System.out.println("Enter the element for Matrix : ");

		for (c = 0; c < m; c++) {
			for (d = 0; d < n; d++) {
				matrix[c][d] = sc.nextInt();
				//System.out.print(matrix[c][d] + "\t");
			}
			//System.out.println();
		}
		//System.out.print(matrix[c][d] + "\t");
		
		System.out.println("Transpose of given Matrix");
		int transpose[][] = new int[n][m];
		for (c = 0; c < m; c++) {
			for (d = 0; d < n; d++) {
				//System.out.print(matrix[c][d] + "\t");
				
				transpose[d][c] = matrix[c][d];
				System.out.print(transpose[d][c] + "\t");
			}
			System.out.println();
		}
//		System.out.println("Transpose of given Matrix");
//		for (c = 0; c < n; c++) {
//			for (d = 0; d < m; d++) {
//
//				System.out.print(transpose[c][d] + "\t");
//			}
//			System.out.print("\n");
//		}
	}

}
