package pg14;

import java.util.Scanner;

public class Longfactorial {

	public static void main(String[] args) {
		
		int n;
		long fact = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		n = sc.nextInt();
		
		if( n < 0 ) {
			System.out.println("Given number is Negative");
		}else {
			System.out.println("Given Number is Positive");
			for(int c = 1; c <= n; c++) {
				fact = fact * c ;
			}
			System.out.println(n + "! = "+ fact);
		}
		sc.close();
	}

}
