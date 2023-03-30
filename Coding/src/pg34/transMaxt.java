package pg34;

public class transMaxt {

	public static void main(String[] args) {
	int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
	int[][] trans=new int[matrix[0].length][matrix.length];
	
	for(int i= 0; i < matrix.length;i++) {
		for(int j= 0; j < matrix[0].length;j++) {
			trans[j][i] = matrix[i][j];
		}
	}
	System.out.println("Original Matrix : ");
	printMatrix(matrix);
	System.out.println("Transpose Matrix : ");
	printMatrix(trans);
	}

	public static void printMatrix(int[][] matrix) {
		for(int[] row : matrix) {
			for( int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		
	}

}
