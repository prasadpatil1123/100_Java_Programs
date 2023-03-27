package pg32;

import java.util.Scanner;

public class subtract_Matrix {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the number of rows and columns: ");
			int rows = input.nextInt();
			int cols = input.nextInt();

			int[][] matrix1 = new int[rows][cols];
			int[][] matrix2 = new int[rows][cols];
			int[][] sum = new int[rows][cols];

			System.out.println("Enter the elements of the first matrix: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					matrix1[i][j] = input.nextInt();
				}
			}
			System.out.println("Enter the elements of the second matrix: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					matrix2[i][j] = input.nextInt();
				}
			}
			System.out.println("Substraction of matrices:");
			StringBuilder output = new StringBuilder();
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					sum[i][j] = matrix1[i][j] - matrix2[i][j];
					output.append(sum[i][j]).append("\t");
				}
				output.append("\n");
			}
			System.out.println(output.toString());
		}
	}

}
