package pg25;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for table : ");
		System.out.println();
		int n = sc.nextInt();
		for (int c = 1; c <= 10; c++) {
			System.out.println(n + " * " + c + " = " + (n * c));
		}
		System.out.println();
		sc.close();

	}

}
