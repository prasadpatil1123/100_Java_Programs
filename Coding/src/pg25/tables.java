package pg25;

import java.util.Scanner;

public class tables {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number range for their multiplication Table : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		for(c = a; c <= b; c++ ) {
			
			for( d = 1 ; d <= 10 ; d++) {
				System.out.println();
				System.out.println(c + " * "+ d + " = " + (c * d) );
			}
		}
		
	}

}
