package pg8;

import java.util.Scanner;

//How to add two number Program in java
public class addNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x , y;
		System.out.println("Enter the value of x & y : ");
		x = sc.nextInt();
		y = sc.nextInt();
		int sum = x + y;
		System.out.println("Sum is : " + sum);
		sc.close();
	}

}
