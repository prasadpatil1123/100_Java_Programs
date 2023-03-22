package pg7;

import java.util.Scanner;

public class swapNumberPro {

	public static void main(String[] args) {
		int x , y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x & y : ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Before swapping \n x is " + x +"\n y is " + y);
		x = x + y ;
		y = x - y ;
		x = x - y ;
		System.out.println("After swapping \n x is " + x + "\n y is " + y);

		sc.close();
	}

}
