package pg28;

import java.util.Scanner;

public class FloyedTri {

	public static void main(String[] args) {
		int num = 1;
		System.out.println("Enter the number of Rows :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int x = 1; x < n ; x++) {
			for(int d = 1; d < x; d++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		sc.close();
	}

}
